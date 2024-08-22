package DesignPatterns.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BasicSingleton {

    private BasicSingleton(){

    }
    private static final BasicSingleton basicSingleton=new BasicSingleton();

    public static BasicSingleton getInstance(){
            return basicSingleton;
    }

    class Demo{
        public void saveToFile(String filename, BasicSingleton basicSingleton)throws Exception{
           try(FileOutputStream fileOut= new FileOutputStream(filename); ObjectOutputStream out=new ObjectOutputStream(fileOut)){
             out.writeObject(basicSingleton);
           }
        }
        public  BasicSingleton readFrromFile(String filename) throws Exception{
            try(FileInputStream filein=new FileInputStream(filename);
            ObjectInputStream in=new ObjectInputStream(filein)){
                return (BasicSingleton) in.readObject();
            }
        }
    }
    public static void main(String[] args){
        BasicSingleton basicSingleton1=BasicSingleton.getInstance();

    }
}
