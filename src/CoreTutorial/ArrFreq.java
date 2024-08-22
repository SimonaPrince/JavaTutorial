package CoreTutorial;

import java.util.HashMap;

public class ArrFreq {

    public static void findFrequency(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer> count= new HashMap<>();
        for(int i=0;i<n;i++){
            if(count.containsKey(arr[i])){
                count.put(arr[i],count.get(arr[i])+1);
            }
            else{
            count.put(arr[i],1);}
        }
        System.out.print(count.entrySet());
    }
    public static void main(String[] args){
        int[] arr={1  ,  2  , 8  ,3  , 2 ,  2  , 2  , 5 ,  1  };
        findFrequency(arr);
    }
}
