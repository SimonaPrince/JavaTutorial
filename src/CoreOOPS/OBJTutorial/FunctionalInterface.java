package CoreOOPS.OBJTutorial;

public class FunctionalInterface {

    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is calling a functional interface method: " +Thread.currentThread());
            }
        }).start();

        new Thread(() -> {
            System.out.println("This is calling the same method using lamba expression: "+ Thread.currentThread());
        }).start();
    }
}
