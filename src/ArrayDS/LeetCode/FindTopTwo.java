package ArrayDS.LeetCode;

import java.util.Arrays;

public class FindTopTwo {

    public static int[] findTop(int[] arr){
      int maxTwo=0;
      int maxOne=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]> maxOne){
                maxTwo=maxOne;
                maxOne=arr[i];
            }

        }
        return new int[]{maxOne,maxTwo};
    }
    public static void main(String[] args){
      int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
      int[] max=findTop(myArray);
        Arrays.stream(max).forEach(System.out::println);
    }
}
