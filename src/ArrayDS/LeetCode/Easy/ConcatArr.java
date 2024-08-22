package ArrayDS.LeetCode.Easy;

import java.util.Arrays;


//No time complexity involved fastest solution(Leetcode)0ms..

public class ConcatArr {
    public static int[] concat(int[] arr){
        int n=arr.length;
        int[] res = new int[2*n];
        System.arraycopy(arr,0,res,0,n);
        System.arraycopy(arr,0,res,n,n);
        return res;
    }

    public static void main(String[] args){
        int[] nums={1,2,2,1};
        System.out.println(Arrays.toString(concat(nums)));
    }
}
