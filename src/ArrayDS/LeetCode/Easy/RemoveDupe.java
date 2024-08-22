package ArrayDS.LeetCode.Easy;

public class RemoveDupe {
    public static int removeDup(int[] arr){
        int i=0;
        int j=i+1;
        while(i< j && j <arr.length){
            if(arr[j] == arr[i]){
                j++;
            }
            else{
                arr[++i]=arr[j];
                j=j+1;
            }
        }
      return i+1;
    }
    public static void main(String[] args){
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        System.out.println("Remove duplicates from sorted:"+removeDup(arr));
    }
}
