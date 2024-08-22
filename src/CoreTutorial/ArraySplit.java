package CoreTutorial;

public class ArraySplit {
    public static int splitSum(int[] arr){
        int leftSum=0,rightSum=0;
        for(int i=0;i<arr.length;i++){
            leftSum+=arr[i];
            rightSum=0;
            for(int j=i+1;j< arr.length; j++){
                rightSum+=arr[j];
            }
            if(leftSum == rightSum)
                return i+1;
        }
        return -1;
    }
    static void printTwoParts(int arr[])
    {

        int splitPoint = splitSum(arr);

        if (splitPoint == -1 || splitPoint == arr.length )
        {
            System.out.println("Not Possible");
            return;
        }

        for (int i = 0; i < arr.length; i++)
        {
            if(splitPoint == i)
                System.out.println();

            System.out.print(arr[i] + " ");

        }
    }
    public  static void main(String[] args){
        int[] arr= { 1 , 2 , 3 , 4 , 5 , 5  };
        printTwoParts(arr);
    }
}
