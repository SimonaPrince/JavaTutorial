package CoreTutorial;

import java.util.Scanner;

public class StringParting {
    public static void partString(String str,int n){
       int i=0;
       int x=str.length();
       String str1;
       int m=n;
      while(m<x){
           str1=str.substring(i,m);
           System.out.println(str1);
           i+=n;
           m+=n;
       }
      System.out.println(str.substring(1,m));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="abcdefghijklmnopqrstuvwxy";
        partString(s,n);
    }

}
