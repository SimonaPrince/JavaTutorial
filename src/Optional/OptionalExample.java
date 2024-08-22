package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args){
        List<String> names= Arrays.asList("Simona","Richa","Shyam","Bharti","Jayashree");
        Optional<String> opt=Optional.of(Arrays.toString(names.toArray()));
        opt.ifPresent(System.out::println);
    }
}
