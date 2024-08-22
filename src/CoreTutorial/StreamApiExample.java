package CoreTutorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args){
        List<StudentDetl> studentList=new ArrayList<>();
        studentList.add(new StudentDetl("Simona","CSE"));
        studentList.add(new StudentDetl("Richa","EEE"));
        studentList.add(new StudentDetl("Mahima","CSE"));

        studentList.stream().collect(Collectors.groupingBy(s -> s.getBranch(), HashMap::new,Collectors.mapping(StudentDetl::getName,Collectors.toList()))).entrySet().forEach(System.out::println);

    }
}
