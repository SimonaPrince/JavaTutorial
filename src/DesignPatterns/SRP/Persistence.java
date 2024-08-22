package DesignPatterns.SRP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Persistence {

    public void saveToFile(Journal journal,String Filename,Boolean overwrite) throws FileNotFoundException {
        if(overwrite || new File(Filename).exists()){
            try(PrintStream out =new PrintStream(Filename)){
                out.println(toString());
            }
        }
    }
   public static void main(String[] args) throws IOException {
        Journal j=new Journal();
        j.addEntry("I cried today");
        j.addEntry("I hope i don't !!");
        System.out.println(j);

        Persistence p=new Persistence();
      String filename="C:\\Users\\simon\\OneDrive\\Desktop\\journal.txt";
        p.saveToFile(j,filename,true);
        Runtime.getRuntime().exec("notepad.exe"+filename);
   }
}
