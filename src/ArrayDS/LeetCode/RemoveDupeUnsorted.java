package ArrayDS.LeetCode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class RemoveDupeUnsorted {
    public static void main(String[] args){
        String str="SIMONA PRINCE";
    Arrays.stream(str.split("")).collect(Collectors.groupingBy(s -> s, LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(s -> s.getValue() <=1).forEach(System.out::println);
    }
}
