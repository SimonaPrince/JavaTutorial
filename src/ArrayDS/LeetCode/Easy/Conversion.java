package ArrayDS.LeetCode.Easy;

import java.util.Arrays;
import java.util.stream.Stream;

public class Conversion {
    public static void convert(int[] arr){
        System.out.println(Arrays.toString(Stream.of(arr).sorted().toArray()));
    }
    public static void main(String[] args){
        int[] arr={90,43,67,12,73};
        convert(arr);
    }
}
