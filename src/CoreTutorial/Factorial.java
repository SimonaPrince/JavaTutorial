package CoreTutorial;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Factorial {

    public static int find(int n){
        if(n == 0)
            return 1;
    return n* find(n-1);
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    System.out.print("Facto="+find(num));
}
}
