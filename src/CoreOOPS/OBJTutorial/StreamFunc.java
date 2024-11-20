package CoreOOPS.OBJTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFunc {

    //Reduce Operation

    public static void longestString(List<String> str){
      str.stream().reduce((w1,w2)-> w1.length() > w2.length() ? w1:w2).ifPresent(System.out::println);
    }

    public static void combineString(List<String> word){
        word.stream().reduce((w1,w2) -> w1 + " " + w2).ifPresent(System.out::println);
    }

    public static void flattenValue(List<List<Integer>> ls){
        ls.stream().flatMap(Collection::stream).toList().forEach(System.out::println);

    }
    public static void main(String[] args){
        ArrayList<Employee> employees= new ArrayList<>();
        employees.add(new Employee("Simona","A001",5000000));
        employees.add(new Employee("Prince","A002",200000));
        employees.add(new Employee("Zeeshan","A003",300000));
        employees.add(new Employee("Shyam","A004",400000));
        employees.add(new Employee("Jayashree","A005",60000));
        employees.add(new Employee("Greeshma","A006",8000));

//        Sorting the Object
        employees.stream().sorted().forEach(e-> System.out.println(e.getName()+":"+e.getSal()));

        //Filter function
        employees.stream().filter(e -> e.getSal() > 400000).forEach(e -> System.out.println(e.getName()+": "+e.getSal()));

//        Collect and store as list

        employees.stream().filter(e -> e.getName().startsWith("S")).collect(Collectors.toList());

//        Increase salary by 1000 rupees
        employees.stream().map(e -> e.getSal()+1000).toList().forEach(System.out::println);

        List<String> words= Arrays.asList("This","is","a","paragraph");
        longestString(words);
        combineString(words);
        List<List<Integer>> ls =new ArrayList<>();
        ls.add(Arrays.asList(1, 2));
        ls.add(Arrays.asList(3, 4));
        ls.add(Arrays.asList(5, 6));
        ls.add(Arrays.asList(7, 8));
        flattenValue(ls);
    }
}
