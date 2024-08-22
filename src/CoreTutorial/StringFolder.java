package CoreTutorial;

import java.util.Scanner;

public class StringFolder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str= new String[n];
        for(int i=0; i<str.length-1;i++){
            if(str[i].equals(str[i+1])){
               String newF=str[i+1];
            }
        }
    }
}
