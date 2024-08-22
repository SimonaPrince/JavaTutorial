package StringDS.LeetCode.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class StringCommonWrd {
    public static String findCommon(String para, String[] banned){
        String[] parar=para.toLowerCase().split("\\W");
        System.out.println(Arrays.toString(parar));
        HashMap<String,Integer> wmap=new HashMap<>();
        for(int i=0;i< parar.length;i++){
          if(wmap.containsKey(parar[i].trim())){
              wmap.put(parar[i].trim(),wmap.get(parar[i])+1);
          }
          else{
              wmap.put(parar[i].trim(),1);
          }
      }
        System.out.println(wmap.entrySet());
        for(int i=0;i< banned.length;i++){
            if(wmap.containsKey(banned[i]))
                wmap.remove(banned[i]);
            }
        //One liner Comparator function of Stream and very easily providing soltuion.
        String res= wmap.entrySet().stream().max((entry1,entry2) -> entry1.getValue() > entry2.getValue() ? 1: -1).get().getKey();
        System.out.println(wmap.entrySet());
        return res;
    }
    public static void main(String[] args){
        String para="Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned={"hit"};
      System.out.println(findCommon(para,banned));
    }
}
