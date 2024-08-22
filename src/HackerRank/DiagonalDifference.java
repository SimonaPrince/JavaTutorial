package HackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int lsum= 0,rsum=0,differ=0;
        for(int i=0 ; i<arr.size();i++){
            for(int j=0; j<arr.get(i).size();j++){
                if(i == j){
                    lsum= lsum + arr.get(i).get(j);
                }
              if((i+j) == arr.get(i).size()-1){
                    rsum=rsum + arr.get(i).get(j);
                }
            }
        }
        System.out.println(lsum);
        System.out.println(rsum);
        differ=lsum-rsum;
        return differ;
    }

    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            arr.add(
                    Stream.of(sc.nextLine().replaceAll("\\s+$", "").split(" "))
                            .map(Integer::parseInt)
                            .collect(toList()));

        });
        int result=diagonalDifference(arr);
        int differ=Math.abs(result);
        System.out.println(differ);
}}
