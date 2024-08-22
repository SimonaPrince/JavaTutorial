package DesignPatterns.Factory;

public class Square implements Shape{
    @Override
    public String getShape() {
        System.out.println("This is square shape");
        return "Square";
    }
    public double getArea(int a){
        return a*a;
    }
}
