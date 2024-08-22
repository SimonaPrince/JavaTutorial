package CoreTutorial;

import java.util.HashMap;
import java.util.Map;

public class DuplicateArr {

    public static void printDuplicate(int[] arr){
        HashMap<Integer,Integer> count=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(count.containsKey(arr[i])){
                count.put(arr[i],count.get(arr[i])+1);
            }
            else{
                count.put(arr[i],1);}
        }
         count.entrySet().stream().filter(c -> c.getValue() > 1).forEach(i -> System.out.print(i.getKey()+" "));

    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,2,7,8,8,3};
        printDuplicate(arr);
        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 40000);
        salaries.put("Freddy", 30000);
        salaries.put("Samuel", 50000);

        salaries.replaceAll((name, oldValue) -> name.equals("Freddy") ? oldValue : oldValue + 10000);
        System.out.println(salaries.entrySet());
    }
}
