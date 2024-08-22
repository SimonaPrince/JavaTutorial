package CoreTutorial;

public class StringHandling {

    public void Names(String str){
        int n= str.indexOf('@');
        int l=str.length();
        String str1=str.substring(0,(n-1));
        String str2=str.substring((n+1),l);
        System.out.println("Username:"+ str1);
        System.out.println("domain name: "+ str2);
        if(str2.matches(".*gmail.*"));
        System.out.println("the domain name matches gmail.com");

    }
    public void printCharatIndx(String str,int k){
        char ch= str.charAt(k);
    }
    public  static String  modify(String str, int indx,String ch){
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.insert(indx,ch);
        String mod=stringBuilder.toString();
        return mod;
    }
public static void main(String[] args){

        String str="GEEKSGEEKS";
        int k=4;
      String mod=  modify(str,5," FOR ");
      System.out.print("Modified String:"+mod);
}
}
