package CoreTutorial;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExmpl1 {
    public static void main(String[] args){
        List<StudentDet> studDet= new ArrayList<>();
        studDet.add(new StudentDet("Simona","01","Science"));
        studDet.add(new StudentDet("Prince","02","Commerce"));
        studDet.add(new StudentDet("Manju","03","Arts"));
        studDet.add(new StudentDet("Zeeshan","04","Science"));
        studDet.add(new StudentDet("Shyam","05","Commerce"));
        studDet.add(new StudentDet("Jayashree","06","Arts"));
        //Code is very clean and concie and we filter the data and print without the use of excess complicated lines
        //filter studentdetails and print only those
        studDet.stream().filter(s -> Objects.equals(s.department, "Commerce"))
                .forEach(s -> System.out.println(s.rollNo +" "+s.name));
        //Convert List into Set example
        Set<String> studName=studDet.stream().filter(p->p.department == "Arts").map(p -> p.name).collect(Collectors.toSet());
        System.out.println(studName);

        //Convert List into Map Example
        Map<String,String> studData=studDet.stream().filter(p->p.department == "Science").collect(Collectors.toMap(p -> p.rollNo, p-> p.name));
        System.out.println(studData);

        //Method Reference in Stream
        List<String> name=studDet.stream().filter(p -> p.department == "Commerce").map(StudentDet::getName).collect(Collectors.toList());
        System.out.println(name);
    }

}
