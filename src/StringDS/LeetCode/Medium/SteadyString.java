package StringDS.LeetCode.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SteadyString {

    public static int lengthSubString(String string){
        String[] str= string.split("");
        int length = 0;
        int target_Count= str.length / 4;
        HashMap<String,Integer> count= new HashMap<>();
        for(int i=0; i< str.length;i++){
            if(count.containsKey(str[i])){
                count.put(str[i],count.get(str[i])+1);
            }
            else {
                count.put(str[i],1);
                }
            }
        System.out.println(count.entrySet());
        for (Map.Entry<String, Integer> temp:count.entrySet()) {
             if(temp.getKey().equals("B") || temp.getKey().equals("U")||temp.getKey().equals("D")||temp.getKey().equals("H")){
                int actual_count= temp.getValue();
                if(actual_count < target_Count)
                    length=length+ (target_Count-actual_count);
                if(actual_count > target_Count)
                    length= length+(actual_count-target_Count);
             }
        }
        return length;
    }
    public static int balancedString(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int n=s.length();
        int maxCount=n / 4;
        int lenToBalance=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(Character temp:map.keySet()){
            if(temp == 'Q' || temp == 'W'|| temp == 'E'|| temp =='R'){
                if(map.get(temp) < maxCount){
                    lenToBalance= lenToBalance + maxCount-map.get(temp);
                }
                else if(map.get(temp) > maxCount){
                    lenToBalance= lenToBalance + map.get(temp)- maxCount;
                }
            }
        }
        return lenToBalance;
    }
    public static void lengthBalanced(String s){
        String st="";
        int n=s.length();
        int count=0;
        int target=n / 4;
        int i=0;
        int j=i+1;
        while(i < j && j < s.length()){
           st=s.substring(i,j);

           j++;
           System.out.println("## "+st);
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str="WQWRQQQW";
        String st="HBBBUBBB";
        lengthBalanced(st);
        System.out.println("Length of Substring:"+balancedString(str));
    }

}
