package StringDS.LeetCode.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

    //Solution is good only for small arrays not for larger arrays of string
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        String temp;
        String[] s1=s.split("");
        String[] t1=t.split("");
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(s1[i].compareTo(s1[j]) > 0){
                    temp = s1[i];
                    s1[i] = s1[j];
                    s1[j] = temp;
                }
                if(t1[i].compareTo(t1[j]) > 0){
                    temp = t1[i];
                    t1[i] = t1[j];
                    t1[j] = temp;
                }
            }
        }
        Arrays.stream(s1).forEach(System.out::print);
        System.out.println(" ");
        Arrays.stream(s1).forEach(System.out::print);

        return Arrays.equals(s1,t1);
    }
    public static boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (smap.containsKey(s.charAt(i))) {
                smap.put(s.charAt(i), smap.get(s.charAt(i)) + 1);
            } else {
                smap.put(s.charAt(i), 1);
            }
            if (tmap.containsKey(t.charAt(i))) {
                tmap.put(t.charAt(i), tmap.get(t.charAt(i)) + 1);
            } else {
                tmap.put(t.charAt(i), 1);
            }
        }
        for(Character ch:smap.keySet()){
            if(!tmap.containsKey(ch) && !(tmap.get(ch) == smap.get(ch)))
                return false;
        }
        return true;
    }
    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        String[] st=s.split("");
        Arrays.sort(st);
        String[] ts=t.split("");
        Arrays.sort(ts);
       return Arrays.equals(st,ts);

    }
    public static void main(String[] args){
        String s = "anagram", t = "nagaram";
        String s1="rat",t1="car";
      System.out.println("Given string are Anagram:"+isAnagram2(s1,t1));
    }
}
