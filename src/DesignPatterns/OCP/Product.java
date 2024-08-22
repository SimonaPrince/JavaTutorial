package DesignPatterns.OCP;

enum Color{
    RED,BLUE,GREEN
}
enum Size{
    SMALL,LARGE,MEDIUM,HUGE
}
public class Product {

    Color color;
     Size size;
     String name;

    public Product(Color color, Size size, String name) {
        this.color = color;
        this.size = size;
        this.name = name;
    }

}
