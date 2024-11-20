package DataStructures.LinearDS.ArrayDS.SortingAlgos;

import java.util.Arrays;

public class InsertionSorting {

    public static int[] Sorting(int[] arr){
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j-1;
            while ( (i > -1) && ( arr [i] > key ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = key;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={54,32,89,41,67,21};
        int[] sort=Sorting(arr);
        System.out.println(Arrays.toString(sort));
    }
}
