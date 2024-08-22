package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args){
        List<String> names= Arrays.asList("Simona","Richa","Shyam","Bharti","Jayashree");
        Consumer<String> consumer= System.out::println;
        consumer.accept(names.toString());

    }
}
