package CoreTutorial;

import java.util.ArrayList;
import java.util.List;

public class LambExmpl2 {
    public static void main(String[] args) {
        String nm = "Simona";
        Sayable s = (name) -> "hello " + name;
        System.out.println(s.say(nm));
        System.out.println(s.say("Prince"));


        int x = 10, y = 20;
        MathOp mathOp = (a, b) -> (a + b);
        System.out.println("Addtion:"+ mathOp.Operation(x,y));

        List<String> mylist=new ArrayList<>();
        mylist.add("Simona");
        mylist.add("Prince");
        mylist.add("Richa");
        mylist.add("Syanika");
        mylist.add("Simmo");
        mylist.forEach((n)->System.out.println(n));
    }
}
