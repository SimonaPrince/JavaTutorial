package DesignPatterns.Factory;

public class Circle implements Shape{
    int r;
    @Override
    public String getShape() {
        System.out.println("Given shape is circle");
        return "Circle";
    }
    public double getArea(int r){
        return 3.14*r*r;
    }
}
