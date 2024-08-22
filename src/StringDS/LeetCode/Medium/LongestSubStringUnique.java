package StringDS.LeetCode.Medium;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestSubStringUnique {

    //Very slow for huge string length and time consuming not so optimized
    //Brute Force Algorithm
    public  int lengthOfLongestSubstring(String s) {
        String uniquesub="";
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            uniquesub="";
            for(int j=i;j<s.length();j++){
                uniquesub+=s.charAt(j);
                if(uniqueCharacters(uniquesub)){
                    if(uniquesub.length() >maxLen)
                        maxLen=uniquesub.length();
                }
            }
        }
        return maxLen;
    }

    //Sliding window technique Leetcode Medium Question solved myself
    //O(1)
    public static int findSubUnique(String s){
        int l=0;
        int r=l+1;
        String substr="";
        int maxLen=0;
        Set<String> st=new HashSet<>();
        while(l<=r && r <=s.length()){
                substr=s.substring(l,r);
                if(st.contains(substr)){
                    continue;
                }
                else{
                    st.add(substr);
                }
                if(uniqueCharacters(substr) ){
                   if(substr.length() >maxLen)
                         maxLen=substr.length();
                   r++;
                }
                else {
                    l++;
                }
        }
        return maxLen;
    }
 public static boolean uniqueCharacters(String s)
    {
        // If at any character more than once create another stream
        // stream count more than 0, return false
        return s.chars().filter(e -> Collections.frequency(s.chars().boxed().collect(Collectors.toList()), e) > 1).count() <= 1;
    }
    public static void main(String[] args){
//        String longestSubstring = "asdfasdfbhnjiofdeefs";
//        StringDS.LeetCode.Medium.LongestSubStringUnique ln=new StringDS.LeetCode.Medium.LongestSubStringUnique();
//       System.out.println(ln.lengthOfLongestSubstring(longestSubstring));
        String s="asdfasdfbhnjiofdeefs";
        String s1="a";
        System.out.println(findSubUnique(s1));

    }
}
