package OOPS;

public abstract class vehicle {

    vehicle(){
            System.out.println("Vehicle initialized");
    }
    public void stop(){
        System.out.println("Stopped vehicle");
    }
     abstract void start();
}
