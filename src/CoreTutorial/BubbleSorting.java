package CoreTutorial;

import java.util.Arrays;

public class BubbleSorting {

    public static void sort(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr={3,8,5,0,2,7};
        sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
