package ArrayDS.LeetCode.Medium;

import java.util.Arrays;

public class RotateArray {
    //without using an extra space
    public static void rotate(int k,int[] arr){
            int i=0;
            int j=arr.length-1;
            while(i<k){
                int temp=arr[arr.length-1];
                while(j>0){
                    arr[j]=arr[j-1];
                    j--;
                }
                arr[j]=temp;
                j= arr.length -1;
                i++;
            }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        rotate(3,arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
