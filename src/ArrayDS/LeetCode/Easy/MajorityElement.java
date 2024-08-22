package ArrayDS.LeetCode.Easy;

import java.util.Arrays;

public class MajorityElement {

    public static int majorElement(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        int n = arr.length;
        int targetCount = n / 2;
        int i = 0;
        int j = 0;
        while (i <= j && j < n) {
            if (arr[i] == arr[j]) {
                count++;
                j++;
                if(j== n){
                    if(count > targetCount){
                        return arr[i];
                    }
                }
            } else {
                if (count > targetCount) {
                    return arr[i];
                } else {
                    i = j;
                    count = 0;
                }
            }
        }
        return arr[i];
    }

    public static void main(String[] args){
        int[] ar={3,2,3};
        int arr1[] ={2,2,1,1,1,2,2};
        System.out.println(majorElement(arr1));
    }
}
