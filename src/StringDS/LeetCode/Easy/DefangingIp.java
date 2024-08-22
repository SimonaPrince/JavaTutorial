package StringDS.LeetCode.Easy;

public class DefangingIp {
    public static void defanging(String str){
        String[] arr=str.split("");
        if(str.isEmpty())
            System.out.println("Empty String");
        str="";

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(".")){
                arr[i]="[.]";
            }
             str=str+arr[i];
        }
       System.out.println(str);

    }
//Easiest Solution but i chose a very complicated solution.Next time pay attention.
    public  static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
    public static void main(String[] args){
        String str="1.1.1.1";
         defanging(str);
        System.out.println(defangIPaddr(str));
    }
}
