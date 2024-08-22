package ArrayDS.LeetCode.Easy;

import java.util.Arrays;

public class PushZeroEnd {

    //Method written by me
    public static void zeroEnd(int[] arr){
        int n=arr.length;
        int count= (int) Arrays.stream(arr).filter(i -> i ==0).count();
        int temp=0;
        for(int i=0;i<n;i++){
            if(Arrays.copyOfRange(arr,n-count,n-1).length != count){
           for(int j=0;j<n-1;j++){
               if(Arrays.copyOfRange(arr,n-count,n-1).length != count){
               if(arr[j] == 0){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }}
               else
                   break;
           }}
            else
               break;
        }
    }

    //Method from geek for geeks
    static void pushZerosToEnd(int arr[], int n)
    {
        int count = 0;  // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
        // incremented

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
            arr[count++] = 0;
    }

    public static void main(String[] args){
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
//        zeroEnd(arr);
        pushZerosToEnd(arr,n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
