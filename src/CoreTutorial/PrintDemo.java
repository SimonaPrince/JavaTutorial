package CoreTutorial;

public class PrintDemo {
    public static synchronized void print(){
        try {
            for(int i=1; i<=5 ; i++){

                System.out.println("Thread Counter "+ i);
            }
        } catch (Exception e) {
           System.out.println("Interrupted");
        }
    }
}
