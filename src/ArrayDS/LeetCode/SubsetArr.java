package ArrayDS.LeetCode;

public class SubsetArr {
    public static void findSubset(int[] arr1,int[] arr2){
        boolean found=false;
        for(int i=0;i<arr2.length;i++){
            found=false;
            for(int j=0;j<arr1.length;j++){
                if(arr2[i] == arr1[j]){
                  found=true;
                  break;
                }
            }
            if(!found){
                System.out.println("arr2 is not a subset of arr1");
                break;
            }
        }
        if(found){
            System.out.println("arr2 is a subset of arr1");
        }
    }
    public static void main(String[] args){
      int[]  arr1 = {11, 1, 13, 21, 3, 7};
      int[] arr2 = {11, 3, 7, 1};
      //Sample
        int[]  arr3 = {10, 5, 2, 23, 19};
        int[] arr4= {19, 5, 3} ;
      findSubset(arr3,arr4);
    }
}
