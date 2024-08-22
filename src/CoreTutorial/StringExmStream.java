package CoreTutorial;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringExmStream {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s="aabbccddd";
        HashMap<String,Long> ch=  Arrays.stream(s.split("")).collect(Collectors.groupingBy(st -> st, HashMap::new,Collectors.counting()));
        String max= String.valueOf(ch.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey));
        System.out.println(max);
        String find= String.valueOf(Arrays.stream(s.split("")));
    }
}
