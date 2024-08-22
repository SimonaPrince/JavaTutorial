package LeetCode;

class StringP1 {
    public static String mergeAlternately(String word1, String word2) {
        char[] str1=word1.toCharArray();
        char[] str2=word2.toCharArray();
        String word3="";
        StringBuilder stringBuilder=new StringBuilder();
        String str3="";
        int n=str1.length;
        int m=0;
        if(str1.length>str2.length){
            n=str2.length;
            m=str1.length-str2.length;
            stringBuilder=new StringBuilder(word1);
        }
        else if(str1.length<str2.length){
            n=str1.length;
            stringBuilder=new StringBuilder(word2);
            m=str2.length-str1.length;
        }
        for(int i=0; i<n;i++){
            word3= word3+str1[i]+str2[i];
            System.out.println(word3);
        }
        String temp=stringBuilder.substring(m-1);
        if(str1.length != str2.length)
            word3= word3 + temp;
        else
            word3= word3;
        return word3;
    }
public static void main(String[] args){
        String word=mergeAlternately("cdf","abc");
        System.out.println(word);
}
}

