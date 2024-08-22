package StringDS.LeetCode.Easy;

public class IndexFirstOccurence {
    public static int findOccurrence(String haystack, String needle){
        int n=haystack.length();
        int i=0;
        int j=i+1;
        while(i <= j && j<= n){
           if(haystack.substring(i,j).equals(needle)){
               return i;
           }
           else {
               j++;
               if(j > n){
                   i++;
                   j=i+1;
               }
           }
        }
        return -1;
    }
    public static void main(String[] args){
      String s="sadbutsad";
      String t="sad";
      String s1="leetcode";
      String s2="leeto";
      String str="hello";
      String str2="ll";
      System.out.println("First Occurence:"+ findOccurrence("aaa","aaa"));
    }
}
