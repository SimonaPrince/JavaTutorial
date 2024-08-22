package CoreTutorial;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
    static void sort(int[]ar){
        int n=ar.length;
        for(int i=1;i<n; i++){
            int key=ar[i];
            int j=i-1;
            while(j>=0 && ar[j]> key){
                ar[j+1]=ar[j];
                j=j-1;
            }
            ar[j+1]=key;
        }
    }
    static void printArray(int arr[])
    {
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr={45, 72, 31, 22,10, 90};
        List<Boolean> boob=new ArrayList<>();
        boob.add(true);
        System.out.println("Before Sorting");
        printArray(arr);
        System.out.println("After Sorting");
        sort(arr);
        printArray(arr);

    }
}
