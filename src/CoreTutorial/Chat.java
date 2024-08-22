package CoreTutorial;

public class Chat {
    boolean flag=false;
    public synchronized void Question(String msg){
        if(flag){
            try {
                wait(20);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
        System.out.println(msg);
        flag=true;
        notify();
    }
    public synchronized void Answer(String msg){
        if(!flag){
            try {
                wait(20);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
        System.out.println(msg);
        flag=false;
        notify();
    }
}
