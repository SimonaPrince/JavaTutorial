package OOPS.InnerClassTypes;


//Mthod local inner class has inner class created inside the local method of the parent class and object is created in the local method and called the method of subclass
public class MethodLocalInnerClass {
    void show(){
        System.out.println("Outer shown");

        class Inner{
            void show(){
                System.out.println("Inner shown");
            }
        }
        Inner y=new Inner();
        y.show();
    }
    public static void main(String[] args){
       MethodLocalInnerClass mt=new MethodLocalInnerClass();
       mt.show();
    }
}
