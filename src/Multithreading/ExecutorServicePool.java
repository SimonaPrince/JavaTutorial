package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServicePool {
    public static void main(String[] args){
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        executorService.execute(() ->{
            System.out.println("Running Thread:" + Thread.currentThread().getName());
        });
        executorService.shutdown();
    }
}
