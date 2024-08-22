package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args){
        List<String> names= Arrays.asList("Simona","Prince","Zeeshan","Ahmed");
        Predicate<String> pr=n -> n.startsWith("S");
        for(String st:names){
            if(pr.test(st))
                System.out.println(st);
        }
    }
}
