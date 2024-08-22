package OOPS;

class One{
    public static void print(){
        System.out.println("1");
    }
}

class Two extends One{
    public static void print(){
        System.out.println("2");
    }
}
//regardless of which object the reference is pointing to, it always calls the static method defined by the reference class
 class Test2{
    public static void main(String args[]){
        One one = new Two();
        Two two=new Two();
        two.print();
        one.print();
    }
}
