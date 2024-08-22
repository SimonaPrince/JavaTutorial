package CoreTutorial;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer t) {
        System.out.println("Implementing:"+t);
    }
}
