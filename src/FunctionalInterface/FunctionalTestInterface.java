package FunctionalInterface;

public class FunctionalTestInterface {

    public static void main(String[] args){
        Calculator calc=(x,y)-> x+y;
        Show show=() -> System.out.println("Display show interface");
        System.out.println("Addition:"+calc.add(3,4));
       show.display();
       calc.isWhat();
       Subtract subtract=(a,b) -> b-a;
        System.out.println("Subtraction:"+subtract.sub(3,4));
        subtract.isWhat();

    }
}
