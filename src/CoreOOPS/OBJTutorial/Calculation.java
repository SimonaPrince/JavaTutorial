package CoreOOPS.OBJTutorial;

public class Calculation {

    public static void main(String[] args){
        int a=10;
        int b=20;

        //Lambda function to define the method
       Calculator<Integer> calc= (x,y) -> (x+y);
       int sum= calc.Calc(a,b);
       System.out.println(sum);

    }
}
