package StringHandling;

import java.util.Arrays;

public class RemoveWhitespace {

    public static void main(String[] args){
        String str="Remove WhitE Spaces";
        String[] arr= str.split("\\W");
        Arrays.stream(arr).forEach(System.out::print);
        str = str.replaceAll("\\s+", "");
        System.out.println(str);

       String str1="abcde";
        String str2="deabc";
        str1=str1.concat(str1);
        System.out.println(str1);
        System.out.println(str1.indexOf(str2));
    }
}
