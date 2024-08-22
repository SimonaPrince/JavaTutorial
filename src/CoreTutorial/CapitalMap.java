package CoreTutorial;

import java.util.*;

public class CapitalMap {

    static void Search(String key,HashMap<String,String> cap){

        for (Map.Entry<String, String> temp:cap.entrySet()) {
            try {
                if (temp.getKey().equalsIgnoreCase(key))
                    System.out.println("Element Found");
            }catch (NullPointerException ex){
                System.out.println(ex);
            }
        }
    }
    public static void main(String[] args){
        HashMap<String,String> capital=new HashMap<>();
        capital.put("India","New Delhi");
        capital.put("Hyd","Telangana");
        capital.put("Andhra","Vizag");
        capital.put("Bihar","Patna");
        Iterator<String> it= capital.keySet().iterator();
        System.out.println("Before Sorting==============");
        for (Map.Entry<String, String> temp:capital.entrySet()) {
            System.out.println(temp.getKey()+":"+temp.getValue());
        }
        System.out.println("After Sorting==============");
        TreeMap<String,String> tr= new TreeMap<>(capital);
        for (Map.Entry<String,String> temp :tr.entrySet()) {
            System.out.println(temp.getKey()+":"+temp.getValue());

        }

//        Search("India",capital);
//        System.out.print(capital);
    }
}
