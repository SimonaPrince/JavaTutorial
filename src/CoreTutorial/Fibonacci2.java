package CoreTutorial;

import java.util.Scanner;

public class Fibonacci2 {
    static int n1=0,n2=1,n3=0;
    public static void PrintFibonacci(int n){
        if(n>0){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            PrintFibonacci(n-1) ;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(n1+" "+n2);
        PrintFibonacci(n-2);

    }
}
