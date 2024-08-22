package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctNoDuplicates {
    public static void main(String[] args){
        List<String> names=new ArrayList<>();
        names.add("Simona");
        names.add("zeeshan");
        names.add("shyam");
        names.add("jayashree");
        names.add("preethi");
        names.add("harshitha");
        names.add("zeeshan");
        names.add("shyam");
        names.forEach(System.out::println);
        System.out.println("Remove duplicates***************");
        names.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("LIST TO SET**************");
        names.stream().collect(Collectors.toSet()).forEach(System.out::println);
    }
}
