package CoreTutorial;

public class PasswordAsciiFinder {

    public static void main(String[] args){
    String str="796115110113721110141108";
    char[] arr=str.toCharArray();
    String current="";
    String result="";
    for(int i= arr.length-1; i>0 ; i-=2){
        current=""+arr[i] + arr[i-1];
        int n=Integer.parseInt(current);
        if(n==32)
            result=result+" ";
        else if ((n>=65 && n<=90 )|| (n>=97 && n<=99))
            result=result+(char)n;
        else {
            if (i - 2 < 0)
                break;
            current += arr[i - 2];
            n = Integer.parseInt(current);
            result += (char) n;
            i--;
        }
    }
        System.out.println(result);
    }

}
