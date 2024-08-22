package ArrayDS.LeetCode.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AscFrequency {

    public static void freq(Integer[] arr){
        HashMap<Integer,Integer> coll=new HashMap<>();
        int count=1;
        List<Integer> ls= Arrays.asList(arr);
       for(int i=0; i<arr.length;i++){
           if(coll.containsKey(arr[i])){
               System.out.println(coll.get(arr[i]));
                coll.put(arr[i],coll.get(arr[i])+1);
           }
           else{
                 coll.put(arr[i],count);}
       }

       System.out.println(coll.entrySet());
    }
    public static void main(String[] args){
        Integer[] arr={1, 2, 2, 1, 0, 0, 0, 0, 4, 4, 4, 4};
        freq(arr);
    }
}
