package OOPS.InnerClassTypes;

class AnonymousInnerClass {
    void show(){
        System.out.println("In the show method of parent class");
    }
}
class Anonymous {
    static AnonymousInnerClass d = new AnonymousInnerClass() {
        void show() {
            super.show();
            System.out.println("Inside show method of subclass");
        }
    };

    public static void main(String[] args){
        d.show();
    }
}
