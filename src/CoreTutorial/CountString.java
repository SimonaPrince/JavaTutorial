package CoreTutorial;

import java.util.HashMap;
import java.util.Map;

//Find character frequency in alphabetical order.
//ex: "aaddcbb"
//o/p: "a2b2c1d2"

public class CountString {
    public static void main(String[] args){
        String str="aaaabbdccc";
        char[] ar =str.toCharArray();
        int count=0;
        HashMap<Character, Integer> ch=new HashMap<Character, Integer>();
        for(int i=0;i< ar.length;i++){
          for(int j=0;j<ar.length;j++){
              if(ar[i] == ar[j]){
                  count+=1;
              }
          }
            if(!ch.containsKey(ar[i])){
                ch.put(ar[i],count);}
            count=0;
        }
        str="";
        for (Map.Entry<Character, Integer> temp:ch.entrySet()) {
            str=str+ temp.getKey()+temp.getValue();

        }
        System.out.println(str);
    }
}
