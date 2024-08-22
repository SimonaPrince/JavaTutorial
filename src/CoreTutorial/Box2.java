package CoreTutorial;

public class Box2 extends Box1{
    public Box2(){
        System.out.println("Box2 is there");
    }

    public static void main(String[] args){
        Box1 b=new Box1();
        System.out.println("!!!!!!!!!!!!!");
        Box1 b1=new Box2();
        System.out.println("!!!!!!!!!!!!!");
        Box2 b3=new Box2();
    }
}
