package CoreTutorial;

import java.util.*;

public class StringVar {
    public static void main(String[] args) {
        String str = "this_is_variable";
        StringBuilder stringBuilder=new StringBuilder(str);
        String str1=stringBuilder.substring(0,stringBuilder.indexOf("_"));
        String str2=stringBuilder.substring(stringBuilder.lastIndexOf("_")+1,str.length());
        String str3= str2.replace(str2.charAt(0),Character.toUpperCase(str2.charAt(0)));
        String newstr= str1+str3;


        String s="This is Simona Prince";
        StringBuilder reversed=new StringBuilder();
        String[] words= s.trim().split("\\s+");
        for(int i= words.length-1;i>=0;i--){
            reversed.append(words[i]);
            if(i> 0){
                reversed.append(" ");
            }
        }
        String st="hello";
        char[] ch=st.toCharArray();
        String vowel="AEIOUaeiou";
        int i=0;
        char temp;
        int j=ch.length-1;
        while(i<j){
            while(!vowel.contains(ch[i]+"")){
                i++;
            }
            while(!vowel.contains(ch[j]+"")){
                j--;
            }
            if(i<j){
               temp=ch[i];
               ch[i]=ch[j];
               ch[j]=temp;
               i++;
               j--;
            }
        }
      System.out.println(new String(ch));
    }
}
