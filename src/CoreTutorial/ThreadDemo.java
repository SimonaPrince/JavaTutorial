package CoreTutorial;

public class ThreadDemo extends Thread{
    private String threadName;
    private Thread t;

    PrintDemo printDemo;

    public ThreadDemo(String s,PrintDemo pd) {
        threadName=s;
        printDemo=pd;
    }


    @Override
    public  synchronized void run() {
        printDemo.print();
        System.out.println("Thread:"+ threadName+"exiting");
    }

    public void start() {
        System.out.println("Starting Thread :"+ threadName);
        if(t== null){
            t=new Thread(this, threadName);
            t.start();
        }
    }
}
