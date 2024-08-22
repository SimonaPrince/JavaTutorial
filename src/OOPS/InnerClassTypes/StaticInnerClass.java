package OOPS.InnerClassTypes;

//Static nested class has inner class created in the parent class calling the static method of the parent class and called in the parent.inner.method
public class StaticInnerClass {
    public static void OuterMthod(){
        System.out.println("Outer method display");}
      static  class Inner{
            public static void display() {
                System.out.println("Inner method diplay");
                OuterMthod();
            }
        }
        public static void main(String[] args){
        StaticInnerClass.Inner.display();
        }
    }

