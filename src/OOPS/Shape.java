package OOPS;

public class Shape {
    protected void display(){
        System.out.println("Display-base");
    }
}
    //You can provide only a less restrictive or same-access modifier when overriding a method.

//If the method in parent class is final it cannot be overridden
     class Circle extends Shape {
        protected void  display() {
            System.out.println("Display-derived");
        }
        public static void main(String[] args){
            Shape shape=new Circle();
            Circle circle=new Circle();
           shape.display();
        }
    }

