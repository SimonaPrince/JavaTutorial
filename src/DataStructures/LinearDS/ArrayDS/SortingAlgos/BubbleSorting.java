package DataStructures.LinearDS.ArrayDS.SortingAlgos;

import java.util.Arrays;

public class BubbleSorting {

    public static int[] Sorting(int[] arr){
        boolean swap=true;
        for(int i=0;i<arr.length;i++){
            swap=false;
            for(int j=0;j<arr.length-1-i;j++){
               if(arr[j] > arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   swap=true;
               }
            }
            if(!swap)
                break;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={54,32,89,41,67,21};
        int[] sort=Sorting(arr);
        System.out.println(Arrays.toString(sort));
    }
}
