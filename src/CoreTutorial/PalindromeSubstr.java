package CoreTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeSubstr {
    public static void main(String[] args) {
        List<String> substr=new ArrayList<>();
        String str="tacocat";
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length()+1;j++){
                substr.add(str.substring(i,j));
            }
        }
        substr.forEach(System.out::println);

        //To shift array elements

        int[] arr={1,2,3,4,5};
        int n=2;
        int key=n;
        int m=arr.length;
        int[] arrShift=new int[n];
       for(int i=0;i<key;i++){
            arrShift[i]=arr[m-n];
            n--;
        }
       for(int j=m-key-1;j>=0;j--){
           arr[j+key]= arr[j];
       }
      for(int i=0;i<key;i++){
           arr[i]=arrShift[i];
       }
       System.out.println(Arrays.toString(arr));
    //To print the count of each words in a sentence
        String str1 = "Natural ecosystem – It is a ecosystem ecosystem produced biological environment found in nature. It includes deserts, forests, grasslands, lakes, mountains, ponds, rivers, oceans, etc";
        Arrays.stream(str1.split("\\W")).collect(Collectors.groupingBy(s ->s, HashMap::new,Collectors.counting())).entrySet().forEach(System.out::println);
    }
}
