package CoreTutorial;

public class QuickeSort {
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low; j< high;j++){
            if(arr[j] < pivot ){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;

    }
    public static void Sort(int arr[] , int l, int h){
        if(l<h){
            int pi= partition(arr,l,h);
            Sort(arr,l,pi-1);
            Sort(arr,pi+1,h);
        }
    }
    public static void main(String[] args){
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int N = arr.length;
        Sort(arr,0,N-1);
    }
}
