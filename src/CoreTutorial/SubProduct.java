package CoreTutorial;

public class SubProduct {

    public static boolean maxProduct(int[] ar, int n, int p){
        int minVal=ar[0];
        int maxVal=ar[0];
        int maxProd=ar[0];
        for(int i=0; i<n ;i++){
            if(ar[i]<0){
                int temp=maxVal;
                maxVal=minVal;
                minVal=temp;
            }
            maxVal=Math.max(ar[i],maxVal*ar[i]);
            minVal=Math.min(ar[i],minVal*ar[i]);
            if(maxVal== p || minVal == p)
                return true;
            else
                return false;
        }

        return false;
    }

    public static void main(String[] args){
        int[] arr={-2, -1, 3, -4, 5};
        int k=3;
        int n= arr.length;
       System.out.println(maxProduct(arr,n,k));
    }
}
