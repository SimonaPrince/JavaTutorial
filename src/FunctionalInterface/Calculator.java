package FunctionalInterface;

 interface Calculator {
     int add(int a, int b);
     default void isWhat(){
         System.out.println("Calculator is being used");
     }
}
