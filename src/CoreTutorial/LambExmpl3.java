package CoreTutorial;

public class LambExmpl3 {
    public static void main(String[] args){
        Runnable r=()->{System.out.println("Thread1 is running");};
        Thread t=new Thread(r);
        t.start();
    }
}
