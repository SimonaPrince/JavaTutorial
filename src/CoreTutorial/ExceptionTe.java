package CoreTutorial;

public class ExceptionTe {
    public static void main(String [] args){
        int ar[]= new int[2];
        try {
            System.out.println("Accessing ubound array element" + ar[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception:"+e);
        }
    }
}
