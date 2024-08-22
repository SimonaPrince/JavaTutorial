package CoreTutorial;

import java.util.Scanner;

public class CombineArr {

    public static int findElement(int arr[], int n , int key){
        for(int i=0; i<n;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static  void main(String[] args){
        int ar1[] = new int[5];
        int ar2[]=new int[4];
        int ar3[] = new int[9];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array1:");
        for(int i=0; i<5;i++){
            ar1[i]= sc.nextInt();
        }
        System.out.println("Enter Array 2:");
        for(int j=0;j<4;j++){
            ar2[j]= sc.nextInt();
        }
        int c= ar1.length+ ar2.length;
        for(int k=0;k<c;k++){
            if(k == ar1.length){
                System.out.println("Break1");
                break;}
            ar3[k] = ar1[k];
        }
        int j=0;
        for(int k=ar1.length;k<c;k++){
            while(j < ar2.length){
                ar3[k] = ar2[j];
                break;
            }
            j=j+1;
        }
        for(int k=0;k<c;k++){
            System.out.print(ar3[k]+" ");
        }
        System.out.println("");
        System.out.println("Enter the key to be found");
        int key= sc.nextInt();
        int pos=findElement(ar3,c,key);
        if(pos == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element is found at: "+pos);
        }

    }
}
