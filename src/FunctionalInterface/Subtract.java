package FunctionalInterface;

 interface Subtract {
     int sub(int a, int b);
     default void isWhat(){
         System.out.println("Subtract is being used");
     }
}
