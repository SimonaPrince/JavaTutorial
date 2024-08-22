package CoreTutorial;

public class My_Calculator extends Calculator{
    public My_Calculator(int x, int y) {
        super(x, y);
    }

    public void Multiple(){
        My_Calculator myCalculator=new My_Calculator(8,9);
        myCalculator.Display();
        super.Display();
        System.out.println("Multiplication of number is ="+(x*y));
    }

    @Override
    public void Display() {
        System.out.println("This is subclass");
    }

    public static void main(String[] args){
        My_Calculator myCalculator=new My_Calculator(4,5);
        myCalculator.Multiple();
        myCalculator.Add();
        myCalculator.Subtract();
    }
}
