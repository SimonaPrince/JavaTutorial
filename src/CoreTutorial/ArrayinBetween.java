package CoreTutorial;

import java.util.Scanner;

public class ArrayinBetween {
    public static void insertElement(int arr[], int n, int key, int pos){
        for(int i=n-1; i>=pos-1; i--){
            arr[i+1]=arr[i];
        }
        arr[pos-1]=key;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr =new int[20];
        System.out.println("Enter the key to be inserted");
        int key=sc.nextInt();
        System.out.println("Enter the position");
        int pos=sc.nextInt();
        System.out.println("Enter the no of values:");
        int n= sc.nextInt();
        System.out.println("Before Insertion:");
        for(int i=0; i< n;i++){
            arr[i]= sc.nextInt();
        }
        insertElement(arr,n,key,pos);
        System.out.println("After Insertion:");
        for(int i=0; i < (n+1);i++){
            System.out.print(arr[i]+" ");
        }
    }
}
