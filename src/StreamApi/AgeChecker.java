package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AgeChecker {
    List<Integer> ls=new ArrayList<>();

    public static List<Integer> findYound(List<Integer> ls){
      return ls.stream().filter(i -> i <=18).limit(10).collect(Collectors.toList());
    }

    public static void main(String[] args){
        List<Integer> ls=new ArrayList<>();
        ls.add(20);
        ls.add(18);
        ls.add(12);
        ls.add(23);
        ls.add(26);
        ls.add(65);
        ls.add(79);
        ls.add(53);
        ls.add(40);
        ls.add(15);
        ls.add(9);
        ls.add(14);
        ls.add(13);
        ls.add(2);
        ls.add(65);
        System.out.println("Instream:::");
        IntStream.iterate(0, operand -> operand +1).filter(n -> n%2 ==0).limit(5).forEach(System.out::println);
        System.out.println("Instream:::");
        IntStream.iterate(0, operand -> operand +1).limit(5).forEach(System.out::println);
       List<Integer> find= findYound(ls);
       find.forEach(System.out::println);
    }
}
