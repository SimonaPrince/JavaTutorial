package CoreTutorial;

public class SmallestSubarray {

    public static void subArr(int[] arr, int x){
        int sumleft=0;
        int pos=0;
        for(int i=0; i< arr.length;i++){
            sumleft+=arr[i];
            if(sumleft == x){
                pos=i+1;
            }
            else{
                int sumright=0;
                for(int j=i+1;j< arr.length;j++){
                         sumright+=arr[j];
                         System.out.println(arr[i]+","+arr[j]);
                              if(sumright == x)
                                  pos=i+1;
        }}
    }
}
public static void main(String[] args){
        int[] arr={1,4,45,6,0,19};
        subArr(arr,51);
}
}
