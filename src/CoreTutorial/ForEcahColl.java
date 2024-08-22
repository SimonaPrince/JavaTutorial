package CoreTutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEcahColl {
    public static void main(String[] args){
        List<Integer> mylist= new ArrayList<>();
        for(int i=1;i<10;i++)
            mylist.add(i);
        Iterator<Integer> it= mylist.iterator();
        while(it.hasNext()){
            Integer i= it.next();
            System.out.print(i+";");
        }
        mylist.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println("Integer anynymous"+t);
            }
        });
        MyConsumer action= new MyConsumer();
        mylist.forEach(action);
    }
    Runnable r= new Runnable() {
        @Override
        public void run() {
            System.out.println("My Runnable");
        }
    };
    Runnable r1=() -> {
        System.out.println("My Runnable");
    };
}
