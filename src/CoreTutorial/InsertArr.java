package CoreTutorial;

import java.util.Scanner;

public class InsertArr {
    public static int insertElement(int ar[], int key , int n, int capacity){
        if( n >= capacity ){
            return n;}
        ar[n]=key;
        return (n+1);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the capacity");
        int cap=sc.nextInt();
        int arr[] =new int[cap];
        System.out.println("Enter the array length");
        int  n=sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key to be inserted:");
        int key=sc.nextInt();
        int pos=insertElement(arr,key,n,cap);
        System.out.println(pos+" New element postion");
        System.out.println("Array elements are: ");
        for(int i=0; i<pos; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
