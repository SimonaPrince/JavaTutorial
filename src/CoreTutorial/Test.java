package CoreTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test {

    public static void findIndex(int[] arr,int target){
        int n= arr.length;
        HashMap<Integer,Integer> sum= new HashMap<>();
        for(int i=0;i<n;i++){
            sum.put(i,arr[i]);
        }
    }



    public static void binarySearch(int ar[], int l, int r, int key){


        int m= (l+ r)/2;
        if(ar[m] == key){
            System.out.println("Key is found"+ key);
        }
        if (m > key) {
            r=m-1;
            binarySearch(ar,l,m-1,key);
        }
        if(m <key){
            l=m+1;
            binarySearch(ar,m+1,r,key);
        }
    }
    public static void main(String[] args){

    int[][] square={{},{},{}};
    int arr[]={5,3,7,1,4};
    int sum=0;
    for(int i=0; i< 3;i++){
        sum=sum+ square[i][i];
    }
    int target=11;
    Arrays.sort(arr);


        List<Integer> ls=new ArrayList<>();

    }
}
