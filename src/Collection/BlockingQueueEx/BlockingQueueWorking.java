package Collection.BlockingQueueEx;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueWorking {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bl = new ArrayBlockingQueue<>(5);
        bl.put("Volvo");
        bl.poll();
       bl.poll();
        System.out.println("??????????????????");
        bl.forEach(System.out::println);
        bl.put("Mercedes");
        bl.put("Tata");
        bl.put("MG");
        bl.put("XUV");
        System.out.println("??????????????????");
        bl.forEach(System.out::println);
        bl.take();
        bl.remove();
        bl.put("Chevrolet");
        bl.put("Hundai");
        System.out.println("??????????????????");
        bl.forEach(System.out::println);
    }
}
