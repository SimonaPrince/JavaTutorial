package OOPS;

 class Base {
     public Base(){
         System.out.println("Base Called");
     }
     public Base(String s){
         System.out.println("Base called -" + s);
     }
}
class Derived extends Base{
     public Derived(){
//         super("Hello");
         System.out.println("Derived called" );
     }
     public Derived(String s){
//         super();
//         super(s);
         System.out.println("Derived called" + s);
     }
     public static void main(String[] args){
        Derived d= new Derived();
        Base b=new Base();
     }
}
