package CoreTutorial;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatetive {
    public static void main(String[] args){
        String str="POMPOMQAT";
        String found=" ";
        LinkedHashMap<Character,Integer> smap=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            if(smap.containsKey(str.charAt(i))){
                smap.put(str.charAt(i), smap.get(str.charAt(i))+1);
            }
            else{
                smap.put(str.charAt(i),1);
            }
        }
        for (Map.Entry temp:smap.entrySet()) {
            if(temp.getValue().equals(1)){
                System.out.println(temp.getKey());
                break;
            }
        }

    }
}
