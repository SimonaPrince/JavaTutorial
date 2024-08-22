package ArrayDS.LeetCode.Easy;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class ZeroRemoval {

    //Not a very good Code since lots of extra memory is being consumed.
    public static void moveZeroes(int[] arr){
        int[] arr2=new int[arr.length];
        LinkedHashMap<Integer,Integer> ls=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++) {
          if(ls.containsKey(arr[i])){
              ls.put(arr[i],ls.get(arr[i])+1);
             }
          else{
              ls.put(arr[i],1);
          }
             }
        int j=0;
        int m=arr.length -1;
        for (Map.Entry temp:ls.entrySet()) {
            if(!temp.getKey().equals(0)){
                arr2[j]= (int) temp.getKey();
                j++;
            }
            else{
                arr2[m]= (int) temp.getKey();
                 m--;
            }}
        Arrays.stream(arr2).forEach(System.out::println);
        }

        //Another way to solve this problem Simplest
        public static void moveZeroes1(int[] arr){
          int[] arr2=new int[arr.length];
          int j=0;
          for(int i=0;i<arr.length;i++){
              if(arr[i] != 0){
                  arr2[j]=arr[i];
                  j++;
              }
          }
          Arrays.stream(arr2).forEach(System.out::println);
        }

      //Two pointer method but a bit heavy 3ms runtime took 1 hour to figure the solution
      public static void moveZeroes2(int[] arr){
        int left=0;
        int right=1;
        int temp=0;
        while(right < arr.length){
            if(arr[left] == 0 && arr[right] !=0){
                temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right++;
            }
            else if(arr[left] != 0){
                left++;
                right++;
            }
            else{
               right++;
            }
        }
      }

      //The 1 ms solution
      public void moveZeroes4(int[] nums) {
          int i=0;
          int n=nums.length;
          for (int num:nums)
          {

              if(num!=0)
              {
                  nums[i]=num;
                  i++;
              }

          }
          while(i<n)
          {
              nums[i]=0;
              i++;
          }
      }

       public static void main(String[] args){
       int[] arr= new int[]{0,1,0,3,12};
       int[] arr1= new int[]{1,0,1};
       moveZeroes2(arr1);
       }
}
