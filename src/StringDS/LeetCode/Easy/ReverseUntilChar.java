package StringDS.LeetCode.Easy;

public class ReverseUntilChar {

    //LeetCode 0ms Solution
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();

        int found = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ch){
                found = i;
                break;
            }
        }

        for(int i = 0; i <= found/2; i++){
            swap(arr, i, found - i);
        }

        return new String(arr);


    }

    private void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
