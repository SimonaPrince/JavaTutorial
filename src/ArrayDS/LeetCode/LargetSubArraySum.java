package ArrayDS.LeetCode;

public class LargetSubArraySum {
    public static int largestSum(int[] arr){
      int i=0;
      int j=i+1;
      int maxSum=0;
      while(i<j && j<arr.length){
        if(arr[i]+arr[j] >= maxSum){
            maxSum=maxSum+arr[i]+arr[j];
            j++;
        }
        else{
            i++;
            j++;
        }
      }
      return maxSum;
    }
    public static void main(String[] args){
        int[] ar={-2,-3,4,1,-1,-2,1,5,-3};
        System.out.println("Max Sum:"+largestSum(ar));
    }
}
