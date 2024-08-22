package CoreTutorial;

import java.util.Arrays;

public class BinarySearching {
    public static int binSearch(int[] arr, int l, int h,int k) {
        int m = (l + h) / 2;
        if (arr[m] == k) {
            return m;
        } else if (arr[m] > k) {
            return binSearch(arr, l, m - 1, k);
        } else
            return binSearch(arr, m + 1, h, k);
    }

    public static void main(String[] args){
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        Arrays.sort(arr);
        System.out.println("10 is found at index+"+binSearch(arr,0,arr.length-1,10));
    }
}
