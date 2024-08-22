package ArrayDS.LeetCode;

public class findMissingNumber {
    public static int findMissing(int[]arr){
    for(int i=0;i< arr.length;i++){
        if(arr[i] != i+1){
            return i+1;
        }
    }
    return -1;
    }
    public static void main(String[] args){
        int[] myArray = {1,2,3,4,6};
        System.out.println("Missing: "+findMissing(myArray));
    }
}
