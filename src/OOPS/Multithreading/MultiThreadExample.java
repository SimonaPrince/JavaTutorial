package OOPS.Multithreading;

public class MultiThreadExample extends Thread{
    public void run(){
        try{
           System.out.println("Thread running:"+Thread.currentThread().getId());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
