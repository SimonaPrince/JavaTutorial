package CoreTutorial;

public class Stocks {
    public static int findMaxProfit(int[] arr){
        int i=0;
        int j=i+1;
        int maxProfit=0;
        int n=arr.length;
        while(i<j && j<n){
            if(arr[i] < arr[j]){
                if(arr[j] - arr[i] > maxProfit){
                    maxProfit=arr[j] - arr[i];
                }
                else {
                    j++;
                    if (j == n) {
                        i++;
                        j = i + 1;
                    }
                }
            }
            else{
                j++;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int[] arr={100, 180, 260, 310, 40, 535, 695};
        int[] arr1={10,9,8,7,6,5};
        System.out.println("MaxProfit:"+findMaxProfit(arr));
    }
}
