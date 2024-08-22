package CoreTutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrListStr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> cars= new ArrayList<>();
        for(int i=0;i<5;i++){
            String str= sc.nextLine();
            cars.add(str);
        }
        System.out.print(cars);
        Collections.sort(cars);
        System.out.println(cars.size());
    }
}
