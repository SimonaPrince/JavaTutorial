package FunctionalInterface;

public class TestInterface implements Calculator,Subtract{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return b-a;
    }

    @Override
    public void isWhat() {
        Calculator.super.isWhat();
        Subtract.super.isWhat();
    }
    public static void main(String[] args){
        Calculator calc=new TestInterface();
        calc.isWhat();

    }
}
