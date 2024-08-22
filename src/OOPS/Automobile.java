package OOPS;

public class Automobile {

    public Automobile(){
        System.out.println("Automobile called");
    }
   public String drive(){
        return "Driving vehicle";
    }
}
class Car extends Automobile{
    public Car(){
        System.out.println("Car called");
    }
    public String drive(){
        return "Driving car";
    }
}
class ElecttricCar extends Car{
    public ElecttricCar(){
        System.out.println("ELectric car called");
    }

    public String drive(){
        return "Driving electric car";
    }
  //  Parent class reference can be assigned any subclass object but subclass ref can't be assigned parent class object
    public static void main(String[] args){
     ElecttricCar electtricCar=new ElecttricCar();
     System.out.println("EL##########");
        Car car1=new Car();
        System.out.println("EL##########");
        Automobile automobile=new Automobile();
     System.out.println(electtricCar.drive());
        System.out.println(car1.drive());
        System.out.println(automobile.drive());
    }
}