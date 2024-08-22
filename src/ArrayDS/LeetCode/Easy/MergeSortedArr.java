package ArrayDS.LeetCode.Easy;

import java.util.Arrays;

public class MergeSortedArr {
    public static void merge(int[] nums1, int[] nums2, int m , int n){
        System.arraycopy(nums2,0,nums1,m,3);
        Arrays.sort(nums1);

    }
    // LeetCode method took 0ms
    public static void mergeLeet(int[] nums1, int[] nums2, int m , int n){
                int length = (m+n) - 1;
                int i = m-1;
                int j = n - 1;
                int k = length;
                while(j>=0){
                    if(i>= 0 && nums1[i] > nums2[j]){
                        nums1[k] = nums1[i];
                        k--;
                        i--;
                    }
                    else{
                        nums1[k] = nums2[j];
                        k--;
                        j--;
                    }

                }
    }
    public static void main(String[] args){
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3;
        int n=3;
        merge(nums1,nums2,m,n);
        mergeLeet(nums1,nums2,m,n);
        Arrays.stream(nums1).forEach(System.out::println);
    }
}
