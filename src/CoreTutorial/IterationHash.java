package CoreTutorial;

import java.util.HashMap;
import java.util.Map;

public class IterationHash {
    public static void main(String[] args){
        HashMap<String,String> map=new HashMap<>();
        map.put("Simona","Prince");
        map.put("Richa","Singh");
        for (Map.Entry temp:map.entrySet()) {
            System.out.println(temp.getKey()+":"+temp.getValue());
        }
        map.entrySet().stream().forEach( e -> System.out.println(e.getKey() + ":"+e.getValue()));
    }


}
