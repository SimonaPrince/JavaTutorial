package CoreTutorial;

public class Calculator {
    protected int x;
    protected int y;

    public Calculator(int x, int y){
        this.x=x;
        this.y=y;
    }
    protected void Add(){
        System.out.println("Sum of number is="+(x+y));
    }
    public void Display(){
        System.out.println("This is superclass");
    }
    protected void Subtract(){
        System.out.println("Subtraction of number is="+ (x-y));
    }
}
