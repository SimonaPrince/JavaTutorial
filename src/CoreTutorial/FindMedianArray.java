package CoreTutorial;

import java.util.Arrays;

//Took 30 mins to solve the question

public class FindMedianArray {
    public static int findMedian(int[] arr, int n){
        int median=0;
        if(n %2 != 0){
            int[] ar= Arrays.stream(arr).sorted().toArray();
            System.out.println(Arrays.toString(ar));
            median=ar[Math.abs(n/2)];
        }else{
            int[] ar= Arrays.stream(arr).sorted().toArray();
            System.out.println(Arrays.toString(ar));
            median=(ar[n/2]+ar[(n/2)-1])/2;
        }
        return median;
    }
    public static void main(String[] args){
        int[] arr={90 ,100 ,78 ,89, 67};
        int[] arr1={56,67,30,79};
        int n=arr1.length;
        System.out.println(findMedian(arr1,n));
    }
}
