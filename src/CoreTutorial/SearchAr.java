package CoreTutorial;

import java.util.Scanner;

public class SearchAr {
    public static int findKey(int arr[], int n , int key){
        for(int i=0;i<n;i++){
            if(arr[i]== key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int ar[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < 6; j++) {
            ar[j] = sc.nextInt();
        }
        int len = ar.length;
        System.out.println("Enter the key");
        int key=sc.nextInt();
        int pos= findKey(ar,len,key);
        if(pos == -1)
            System.out.println("Key not found");
        else
            System.out.println("Key Found at:"+(pos+1));
    }
}
