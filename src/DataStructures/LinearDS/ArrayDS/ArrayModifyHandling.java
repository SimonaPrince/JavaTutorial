package DataStructures.LinearDS.ArrayDS;

import java.util.Arrays;

public class ArrayModifyHandling {

    public static void insertAtEnd(int[] arr, int x,int cap){
       if(cap == arr.length){
           System.out.println("Array full");
       }
       else{
           arr[cap+1]=x;
       }
    }
    public static void insertAtPos(int[] arr, int x, int pos,int cap){
        for(int i=cap-1;i>0;i--){
            arr[i+1]=arr[i];
            if(i == pos -1){
                arr[i]=x;
                break;
            }
        }
    }

    public static void delAtPos(int[] arr, int pos, int cap){
        for(int i=pos-1;i<cap;i++){
            arr[i]=arr[i+1];
        }
    }
    public static  void main(String[] args){
        int[] arr= new int[10];
        arr[0]=54;
        arr[1]=78;
        arr[2]=13;
        arr[3]=32;
        arr[4]=65;
//        insertAtEnd(arr,21,4);
//        insertAtPos(arr,81,3,5);
        delAtPos(arr,3,5);
        Arrays.stream(arr).forEach(System.out::println);

    }
}
