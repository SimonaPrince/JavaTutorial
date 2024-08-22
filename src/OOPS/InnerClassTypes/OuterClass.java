package OOPS.InnerClassTypes;


//Nested Inner class has a class created inside the parent class with method and called in the main using parentClass.subclass.method
public class OuterClass {
    class InnerClass{
        public void show(){
            System.out.println("Inner class show ");
        }
    }
    public static void main(String[] args){
        OuterClass.InnerClass in=new OuterClass().new InnerClass();
        in.show();
    }
}
