package StringDS;

import java.util.Arrays;
import java.util.Scanner;


//Made in 10 mins very easy question
public class ReverseString {
    public static void reverse(String words){
        String newstr="";
        String[] wrd=words.split(" ");
        for(int i=wrd.length-1; i>=0;i--){
           newstr=newstr+wrd[i]+" ";
        }
        int[] arr={1,2,3,4,5};
        int[] arr2={9,8,7,6,0};
        int[] arr3=new int[arr.length+ arr2.length];
        System.arraycopy(arr,0,arr3,0,arr.length);
        System.arraycopy(arr2,0,arr3,arr.length-1,arr2.length);
        System.out.println(Arrays.toString(arr3));
        System.out.println(newstr);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        reverse(word);
    }
}
