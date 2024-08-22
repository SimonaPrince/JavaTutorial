package LeetCode;
class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for(int i=0; i< m+n; i++){
            if(nums1[i] == 0){
                if(k < n){
                    nums1[i] = nums2[k];
                    k+=1;
                }
                else
                    break;
            }
        }
        int min_indx=0;
        for(int i=0;i<m+n;i++){
            min_indx=i;
            for(int j=i+1; j<n;j++) {
                if (nums1[j] <= nums1[min_indx]) {
                    min_indx=j;
                }
            }
            int temp=nums1[min_indx];
            nums1[min_indx]=nums1[i];
            nums1[i]=temp;
        }
        System.out.println(nums1);
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3, n = 3;
        int[] nums2 = {2, 4, 5};
        merge(nums1,3,nums2,3);

    }
}
