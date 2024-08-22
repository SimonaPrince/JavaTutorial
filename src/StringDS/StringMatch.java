package StringDS;

public class StringMatch {
    public static boolean matchCase(String s1,String s2){
        char[] arr= s1.toCharArray();
        String resArr="";
        int count=0;
       for(int i=arr.length-1;i>=0;i--){
            if(arr[i] == '#'){
                count++;
                if(arr[i-1] != '#'){
                    count+=1;
                     i-=count;
                }
                else {
                    continue;
                }
            }
            if(i>=0 && i< arr.length){
                 resArr=arr[i] + resArr;
            }
        }
        if(resArr.equals(s2))
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        String s1="abc###d";
        String s2="d";
        System.out.println("String Match value:"+matchCase(s1,s2));
    }
}
