package DesignPatterns.Factory;

public class Rectangle implements Shape{
    @Override
    public String getShape() {
        System.out.println("This is Rectangle shape");
        return "Rectangle";
    }
    public double getArea(int l, int b){
        return 2*(l+b);
    }
}
