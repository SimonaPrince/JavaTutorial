package StringDS.LeetCode.Easy;

import java.util.Arrays;

public class LengthOfLastString {
    public static int lengthLastString(String s){
        String[] str= s.trim().split("\\W");
        Arrays.stream(str).forEach(System.out::println);
        System.out.println(":"+str.length);
        return str[str.length-1].length();
    }
    public static void main(String[] args){
        String s="luffy is still joyboy";
        System.out.println("Length of last string is:"+ lengthLastString(s));
    }
}
