package DataStructures.LinearDS.ArrayDS;

import java.util.Arrays;

public class ArraySearchHandling {

    public static void linerSearch(int[] arr, int key){
        for(int i=0;i< arr.length;i++){
            if(arr[i] == key) {
                System.out.println("Key found at position:" + (i + 1));
                break;
            }
        }
    }
    //pre-requisite for binary search array has to be sorted state.
    public static void binarySearch(int[] arr,int l, int r,int key){
        int mid=(l+r)/2;
        if(arr[mid] == key){
            System.out.println("Key found at position:" + (mid+1));
       }
        if(arr[mid] > key){
            binarySearch(arr, l, mid - 1, key);
        }
        if(arr[mid] < key){
            binarySearch(arr, mid + 1, r, key);
        }
    }

    public static void main(String[] args){
        int[] arr={54,32,89,41,76,78};
        Arrays.sort(arr);

        linerSearch(arr,41);

        binarySearch(arr,0, arr.length, 41);
    }
}
