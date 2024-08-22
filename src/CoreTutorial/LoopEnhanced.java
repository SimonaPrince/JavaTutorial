package CoreTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopEnhanced {
    public void Print(){
        int [] num={2,4,6,8,10};
        for(int x:num){
            System.out.print(x+",");
        }
        System.out.println(" ");
        String [] names= {"Simona","Zeeshan","Shyam","Sidd","Greeshma"};
        for(String name: names){
            System.out.print(name +",");
        }
        System.out.println(" ");
        List<Integer> no= Arrays.asList(10,20,30,40,50);
        List<String> empName=Arrays.asList("Simo","Zeeshu","Siddhart","Mintu","Himagshu");
        for(String name: empName){
            System.out.print(name +",");
        }
        System.out.println(" ");
        for(int x:no){
            System.out.print(x+",");
        }
    }
}
