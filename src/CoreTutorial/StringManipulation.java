package CoreTutorial;

public class StringManipulation {
    public static void main(String[] args){
        String str="SIMONA";
        int sum=0;
        for(int i=0;i<str.length();i++){
            int a=str.charAt(i);
            System.out.println("Index of :"+str.charAt(i)+": "+ (a-64));
            sum= sum+(a-64);
        }
        System.out.println("Sum of Alphabets starting with index 1:"+sum);
    }
}
