package CoreTutorial;

public class SubArrays {
    public static void main(String[] args){
        int arr[] = {-1,1,2,3,1};
//        int[] nums = {-6,2,5,-2,-7,-1,3};
//        int i=0;
//        int j=i+1;
//        int sum=0;
        int count=0;
//
        for(int i=0;i<5;i++){
          for(int j=i+1;j<5;j++){
              if(arr[i]+arr[j] < 2){
                 count++;
              }
              System.out.println(i+","+j);
          }
        }
        System.out.println(count+" ->  Total no of arrays ");


        int n=0;
        int m=n+1;
        while(n<m && m<arr.length){
            if(arr[n]+arr[m] < 2){
                count++;
            }
            m++;
        }
    }
}
