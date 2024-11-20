package DataStructures.LinearDS.ArrayDS.SortingAlgos;

import java.util.Arrays;

public class SelectionSorting {

    public static int[] Sorting(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min_idx]){
                    min_idx=j;
                }
            }
            if(i == min_idx)
                continue;
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }

        return arr;
    }
    public static void main(String[] args){
        int[] arr={54,32,89,41,67,21};
        int[] sort=Sorting(arr);
        System.out.println(Arrays.toString(sort));
    }
}
