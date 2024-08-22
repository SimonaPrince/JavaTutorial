package StreamApi;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args){
        List<Integer> numbers= new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(23);
        numbers.add(99);
        numbers.add(100);
        //Function to print Min
        System.out.println(numbers.stream().min((n1,n2) -> n1 > n2 ? 1 :-1 ).get());

        System.out.println(numbers.stream().min(Comparator.naturalOrder()).get());

        //Function to print Max
        System.out.println(numbers.stream().max(Comparator.naturalOrder()).get());
    }
}
