package CoreTutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] ags){
        List<Integer> myList=new ArrayList<>();
        for(int i=1;i<100;i++)myList.add(i);

        //Sequential stream
        Stream<Integer> seq= myList.stream();

        //parallel stream
        Stream<Integer> par=myList.parallelStream();

        //Using filter Options
        Stream<Integer> high =par.filter(p -> p >90);

        high.forEach(p -> System.out.println("High Number parallel"+p));
        //use se stream
        Stream<Integer> seqHi =seq.filter(p -> p >90);
        System.out.println("Sequential");
        seqHi.forEach(p -> System.out.println("High Number parallel"+p));
        //use se stream


    }
}
