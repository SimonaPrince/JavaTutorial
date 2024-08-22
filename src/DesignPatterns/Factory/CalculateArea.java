package DesignPatterns.Factory;

public class CalculateArea {
    public static void main(String[] args){
        ShapeFactory shapeFactory=new ShapeFactory();
      Shape shapeObj=  shapeFactory.getShape("Circle");
        shapeObj.getShape();

    }
}
