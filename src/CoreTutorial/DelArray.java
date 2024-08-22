package CoreTutorial;

import java.util.Scanner;

public class DelArray {
    public static int delElement(int[] arr, int key){
        int pos = 0;
        int n= arr.length;
        for(int i=0; i<n ; i++){
            if(arr[i] == key){
                pos=i;
            }}
        for(int j=pos;j<n-1;j++){
          arr[j]=arr[j+1];
             }
        arr[n-1]= Integer.parseInt(null);
        n--;
        return n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] ar= new int[5];
        System.out.println("Enter the array");
        for(int i=0;i<5; i++){
            ar[i]= sc.nextInt();
        }
        System.out.println("Enter the key to be searched");
        int key= sc.nextInt();
       int len= delElement(ar,key);
        System.out.println("After Deletion Array is:");
        for(int i=0;i<len;i++){
            System.out.print(ar[i]+" ");
        }
    }

}
