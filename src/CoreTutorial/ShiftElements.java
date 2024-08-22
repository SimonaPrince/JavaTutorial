package CoreTutorial;

public class ShiftElements {
    public static void shiftAr(int[] ar, int pos){
        while(pos>0){
            int temp=0;
            temp=ar[ar.length-1];
            for(int i=ar.length-1;i>0;i--){
                ar[i]=ar[i-1];
            }
            ar[0]=temp;
            pos--;
        }
        print(ar);
    }
    public static void print(int[] ar){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,23,45,67};
        shiftAr(arr,3);
    }
}