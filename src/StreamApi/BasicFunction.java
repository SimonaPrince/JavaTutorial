package StreamApi;

import java.util.Collections;
import java.util.stream.Collectors;

public class BasicFunction {
    public static void main(String[] args){
        String s="SIMONA";
        //chars returns the ascii character equivalent of the string
        s.chars().forEach(System.out::println);
        s.chars().boxed();//->creates a integer stream at first with chars method and then creates a stream of objects using boxed operation

        //frequency() method of Java Collections class is used to get the number of elements in the specified collection equal to the specified object
       boolean find= s.chars().filter(i -> Collections.frequency(s.chars().boxed().collect(Collectors.toList()), i) > 1).count() <=1;
    }
}
