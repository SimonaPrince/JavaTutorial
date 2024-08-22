package ArrayDS.LeetCode.Medium;

import java.util.Arrays;

public class ProductExceptSelf {

    //Naive solution with worst case time complexity O(n2) and space complexity also O(n)
    public static int[] productSelf(int[] nums){
        int[] arr=new int[nums.length];
        for(int i=0; i<nums.length;i++){
            int mul=1;
            for(int j=0;j<nums.length;j++){
                if(j != i){
                    mul=mul*nums[j];
                }
            }
            arr[i] = mul;
        }
        return arr;
    }

    //Time complexity O(n) and Spacxe complexity O(1)
    public static int[] productSelf1(int[] nums){
        int i=0;
        int j=0;
        int mul=1;
        int[] answer=new int[nums.length];
        while(j<nums.length && i< nums.length){
           if( i != j){
            mul=mul*nums[j];
            if(j == nums.length -1){
                    answer[i]=mul;
                    mul=1;
                    j = 0;
                    i++;
                    continue;
            }
            j++;
           }
           else{
               j++;
               if(j == nums.length -1){
                   answer[i]=mul;
                   mul=1;
                   j = 0;
                   i++;
                   continue;
           }}
        }
        return answer;
    }

    //Prefix suffix answers from geeks for geeks 3 ms
    public static int[] productSelf2(int[] nums){
        if(nums.length == 0){
            System.out.print(0);
            return new int[]{0};
        }
        int[]prefix=new int[nums.length];
       int[] suffix=new int[nums.length];
        prefix[0]=1;
        suffix[nums.length-1]=1;
        for(int i=1;i< nums.length;i++){
           prefix[i]=prefix[i-1]*nums[i-1];
        }
        for(int j= nums.length-2;j>=0;j--){
            suffix[j]=suffix[j+1]*nums[j+1];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=prefix[i]*suffix[i];
        }

        return nums;
    }

   //1 ms
        public static int[] productExceptSelf(int[] nums) {
            //1 2 3 4
            //24 12 8 6
            int[] result = new int[nums.length];

            //1 1 2 6
            int currentProduct = 1;//6

            for (int i = 0; i < nums.length; ++i) {//i=4
                result[i] = currentProduct;
                currentProduct *= nums[i];
            }

            //24 12 8 6
            currentProduct = 1;//12

            for (int i = nums.length - 1; i >= 0; --i) {//i=3
                result[i] *= currentProduct;
                currentProduct *= nums[i];
            }

            return result;
        }

    public static void main(String[] args){
        int n[] ={1,2,3,4};
        int n1[]={-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(n)));
    }
}
