package StringDS.LeetCode.Easy;

public class IsSubsequence {
    public static boolean subSequence(String s, String t){
        int left=0;
        int i=0;
        boolean found=false;
        while(left <t.length() && i <s.length()){
            if(t.charAt(left) != s.charAt(i)){
                found=false;
                left++;
            }
            else{
                found=true;
                i++;
                left++;
            }
        }
        if(i != s.length()){
            found=false;
        }
     return found;
    }

    //LeetCode 0ms solution
        public boolean isSubsequence(String s, String t) {
            char[] t1= t.toCharArray();
            char[] s1 = s.toCharArray();
            int i=0;
            int j=0;
            while (i<t1.length && j<s1.length){
                if(t1[i]==s1[j]){
                    i++;
                    j++;
                    }
                else i++;
            }
            if(j==s1.length){
                return true;
            }
            return false;
        }

    public static void main(String[] args){
      String  s = "abc";
      String t = "ahbgdc" ;
      String s1="axc";
      String t1 = "ahbgdc";
      String s2= "acb";
      System.out.println("Is Subsequence: "+subSequence(s2,t));
    }
}
