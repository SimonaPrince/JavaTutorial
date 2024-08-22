package CoreTutorial;

public class MthdRefExmpl2 {
    public static void threadStatus(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args){
        Thread t2=new Thread(MthdRefExmpl2::threadStatus);
        t2.start();
    }

}
