package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args){
        List<String> names= Arrays.asList("SIMONA","Prince","Shyam","Bharti","Jayashree");
        Supplier<Integer> supplier= () -> names.size();
        System.out.println(supplier.get());
    }
}
