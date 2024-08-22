package Multithreading;

public class SyncA {
    public  synchronized void show(){

        try{
            System.out.println("Show called"+ Thread.currentThread().getName());
            Thread.sleep(5000);

        }catch(Exception e){

        }
    }
    public static void main(String[] args){
        SyncA a=new SyncA();
        SyncA a1=new SyncA();
        a.show();
        a1.show();
    }
}
