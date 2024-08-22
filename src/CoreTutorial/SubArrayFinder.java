package CoreTutorial;

import java.util.Arrays;
import java.util.TreeMap;
//Took 1 hour to solve.

public class SubArrayFinder {
    public static void main(String[] args){
        int[] arr={1,4,45,6,0,19};
        int x=51;
        int countElement=0;
        TreeMap<Integer,int[]> subElement= new TreeMap<>();
        for(int i=0; i<arr.length;i++){
            for(int j=i; j< arr.length;j++){
                int[] subarr= Arrays.copyOfRange(arr,i,j+1);
                int sum= Arrays.stream(subarr).sum();
                if(sum > x ){
                    countElement= (int) Arrays.stream(subarr).count();
                    subElement.put(countElement,subarr);
                }
            }
        }
        System.out.println(Arrays.toString(Arrays.stream(subElement.get(subElement.firstKey())).toArray()));
    }
}
