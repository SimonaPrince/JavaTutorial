package Collection.BlockingQueueEx;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapWorking {
    public static void main(String[] args){
        Map<String, String> myMap = new ConcurrentHashMap<>();
        //We get concurrent modification exception if we use hashmap.
//        Map<String, String> myMap = new HashMap<>();
        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");
        //Running an iterator against the keys of map
        Iterator<String> it1 = myMap.keySet().iterator();
        while (it1.hasNext()) {
            String key = it1.next();
            System.out.println("Map Value:" + myMap.get(key));
            //Removing the key 2 if exists while iterating
            if (key.equals("2")) {
                myMap.remove("3");
                //Modifying the content
                myMap.put("1", "4");
                myMap.put("4", "4");
            }
            System.out.println("Map Value:" + myMap.get(key));
        }
        System.out.println("Map Value:" + myMap.size());
    }
}
