package CoreTutorial;

public class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;

    RunnableDemo(String tname){
        this.threadName=tname;
        System.out.print("Creating Thread:"+ threadName);
    }
    @Override
    public void run() {
        System.out.println("Running"+ threadName);
        try {
            for(int i=4;i>0;i--){
            System.out.println("Thread:"+threadName+":counter:"+ i);
            Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread:"+threadName+"interrupted");
        }
            System.out.println("Thread:"+ threadName+"exiting");
    }
    public void start(){
        System.out.println("Starting" + threadName);
        if(t== null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}
