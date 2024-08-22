package Multithreading;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteOnFile extends Thread{
    private String msg,fileName;

    public WriteOnFile(String msg,String fileName){
        this.msg=msg;
        this.fileName=fileName;
    }

    private String readFile(){
        String currText = "";
        try {
            // object of File class
            File myFile = new File(this.fileName);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                // reads lines of text file and concatenate
                // it to currText
                currText += myReader.nextLine();
                currText += "\n";
            }
        }
        catch (Exception err) {
        }
        return currText;
    }
    private void write() {
        while (Main.stop == false) {
            try {
                String currText = readFile();
                FileWriter fileWriter = new FileWriter(fileName);
                fileWriter.write(currText + this.msg);

                // closing the writing stream
                fileWriter.close();

                // puts this thread on sleep state for 1.5
                // seconds...it will gives more good
                // experience of writing
                Thread.sleep(
                        60000 );
            } catch (Exception err) {
            }

        }
        return;
    }
    public void run(){
        this.write();
    }

}
