package CoreTutorial;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatetiveChars {

    public static void main(String[] args){
        String str="SpringBootMicroServices";
  Arrays.stream(str.toUpperCase().split("")).collect(Collectors.groupingBy(s -> s, HashMap::new,Collectors.counting())).entrySet().stream().filter(s ->s.getValue() > 1).forEach(Map.Entry::getKey);
        String str1="anagram";
        String str2="nagaram";

        if(str1.length() != str2.length()){
            System.out.println("Not an anagram");
        }
        int count=0;
        for(int i=0; i< str1.length();i++){
            int ch=0;
            for(int j=0; j<str2.length();j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    count++;
                    ch++;
                }
            }
            if(ch < 1){
                System.out.println("not an anagram");
                break;
            }
        }
        if(count == str2.length()){
            System.out.println("Anagram String");
        }

    }
}
