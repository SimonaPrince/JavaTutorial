package CoreTutorial;

import java.util.List;

public class IntegerSorted {

    //GET ALL INTEGERS GREATER THAN 10 AND SORT IT OUT.

    public static void main(String[] args){
        List<Integer> ls= List.of(23,76,9,3,98,12,5,90,63);
       ls.stream().filter(i -> i > 10).sorted().toList().forEach(System.out::println);
    }
}
