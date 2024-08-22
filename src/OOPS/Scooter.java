package OOPS;

public class Scooter extends vehicle{
    public Scooter(){
        System.out.println("Scooter intialized");
    }
    @Override
    void start() {
        System.out.println("Scooter started");
    }
    public static void main(String[] args){
      Scooter s=new Scooter();
        s.start();
        s.stop();
    }
}
