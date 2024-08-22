package CoreTutorial;

public class LambExmpl1 {
    public static void main(String[] args){
        int x=10;
        Drawing d= new Drawing() {
            @Override
            public void draw() {
                System.out.println("Drawing"+x);
            }
        };
        Drawing d1=() ->{System.out.println("DrawingLamb"+x);};

        d.draw();
        d1.draw();
    }
}
