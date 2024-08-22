package CoreTutorial;

import java.util.Scanner;

public class SelectionSortArr {
    public static void sort(int[] arr){
        int min_indx=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
           min_indx=i;
           for(int j=i+1; j<n;j++) {
               if (arr[j] < arr[min_indx]) {
                   min_indx=j;
               }
           }
           int temp=arr[min_indx];
           arr[min_indx]=arr[i];
           arr[i]=temp;
        }}
        public static int binarsearch(int[] arr, int x , int l, int r){
          if(r >= l) {
            int mid= l+((r-l)/2);
            if(arr[mid] == x) {
                return mid;
            }
            if(arr[mid] < x){
                return binarsearch(arr,x,mid+1, r);}
            else {
                return binarsearch(arr,x , l, mid-1);}
          }
          return -1;
        }

    public static void printArray(int[] arr){
        System.out.println("Sorted Array:");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter the array");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr);
        int pos=binarsearch(arr,50,0,arr.length-1);
        printArray(arr);
    }
}
