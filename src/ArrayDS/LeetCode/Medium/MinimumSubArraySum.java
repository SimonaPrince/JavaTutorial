package ArrayDS.LeetCode.Medium;

import java.util.Arrays;

public class MinimumSubArraySum {
    public static int findSum(int[] arr,int target){
        int minSum=0;
        int i=0;
        int j=i+1;
        int count=0;
        while(i < j && j < arr.length) {
          minSum= Arrays.stream(arr).limit(j).sum();
          count++;
          if(minSum >= target){
              return count;
          }
          else{
              minSum=0;
              i++;
              j++;
          }
          if(j == arr.length -1){
              i++;
          }

        }
        return count;
    }
    public static void main(String[] args){
        int[] arr={2,3,1,2,4,3};
        int n=7;
        System.out.println(findSum(arr,n));
    }
}
