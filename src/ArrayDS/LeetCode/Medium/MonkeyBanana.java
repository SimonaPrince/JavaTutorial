package ArrayDS.LeetCode.Medium;

import java.util.Arrays;

public class MonkeyBanana {
    public static boolean findNo(int[] arr,int mid,int hr){
        int time=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % mid !=0){
                time += ((arr[i] / mid) + 1);
            }
            else{
                time +=(arr[i] / mid);
            }
        }
        if(time <=hr){
            return true;
        }
        else {
            return false;
        }
    }
    static int minEatingSpeed(int []arr, int H)
    {
        int start = 1;

        int end = Arrays.stream(arr).max().getAsInt();

        while (start < end) {
            int mid = start + (end - start) / 2;

            if ((findNo(arr, mid, H)) == true) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        return end;
    }
    public static void main(String[] args){
        int[] arr={4,5,6,7,8,9,10};
        System.out.println(minEatingSpeed(arr,10));
    }
}
