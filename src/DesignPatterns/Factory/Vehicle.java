package DesignPatterns.Factory;

public interface Vehicle {

    void display();

    default void isWhat(){
        System.out.println("Type of Vehicle");
    }
}
