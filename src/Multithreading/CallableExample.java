package Multithreading;

import java.util.concurrent.*;

class CallableMessage implements Callable<String> {

    @Override
    public String call() throws Exception {
       return "Hello World";
    }
}
public class CallableExample{
    public static void main(String[] args) throws Exception {
        CallableMessage task=new CallableMessage();
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        Future<String> message= executorService.submit(task);
        CompletableFuture<String> msg= (CompletableFuture<String>) executorService.submit(task);
        System.out.println(message.get());

    }
}
