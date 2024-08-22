package ArrayDS.LeetCode.Easy;

import java.util.Arrays;

public class RemoveElement {

    public static int remove(int[] nums, int val){
            int count=0;
            int i=0;
            int j=nums.length-1;
            if(nums.length == 0){
                return 0;
            }
            while(i < j){
                if( nums[i] == val){
                    if(nums[j] != val){
                        int temp= nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        count++;
                        j--;
                        i++;
                    }
                    else{
                        j--;
                        count++;
                    }
                } else{
                    i++;
                }
            }
            return (nums.length - count);
        }
//All testCases are passing
    public static void main(String[] args){
        int[] arr={0,1,2,2,3,0,4,2};
//        int[] arr={1};
        remove(arr,1);
        Arrays.stream(arr).limit(remove(arr,2) - 1).forEach(i -> System.out.print(i + " "));
    }
}
