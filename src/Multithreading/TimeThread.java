package Multithreading;

//************* T1, T2, T3 -> how to make sure T2 runs after T1 and T3 runs after T2,T1 ************
public class TimeThread {
    public static void main(String[] args){
        Thread t1= new Thread(() -> {
            System.out.println("Thread started"+Thread.currentThread().getName());
        });
        Thread t2= new Thread(()->{
            try {
                t1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread started"+Thread.currentThread().getName());
        });
        Thread t3=new Thread(()->{
            try {
                t2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread started"+Thread.currentThread().getName());
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
