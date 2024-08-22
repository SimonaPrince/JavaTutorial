package Collection.BlockingQueueEx;

import java.util.EnumSet;

public class EnumSetExample {
    enum Game{Cricket,Football,Volleyball,BaseBall,Hockey}

    public static void main(String[] args){
        EnumSet<Game> set1=EnumSet.allOf(Game.class);
        System.out.println("EnumSet:"+set1);

    }
}
