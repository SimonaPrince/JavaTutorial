package CoreTutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileSearch {
    public static void main(String [] args){
        try(FileReader fr=new FileReader("Search.txtx")){
            char[] a =new char[50];
            fr.read(a);
            for(char c:a)
                System.out.println(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
