package Collection.BlockingQueueEx;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args){
        Map<String,Integer> map=new HashMap<>();
        map.put("Simona",1);
        map.put("Zeeshan",3);
        map.put("Shyam",4);
        map.put("Jayashree",5);
        map.put("Siddharth",6);
        map.entrySet().forEach(System.out::println);
        TreeMap<String,Integer> smap=new TreeMap<>(map);
        System.out.println("//////////////");
        smap.entrySet().forEach(System.out::println);
    }
}
