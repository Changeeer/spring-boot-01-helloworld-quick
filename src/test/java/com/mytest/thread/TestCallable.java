package com.mytest.thread;

import java.util.EmptyStackException;
import java.util.concurrent.*;

public class TestCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        TimeUnit.SECONDS.sleep(5);
//        throw new Exception("abd");
        return 666;
    }

    public static void main(String[] args) {
        FutureTask<Integer> task = new FutureTask<>(new TestCallable());
        new Thread(task).start();
        try {
            // FutureTask的get方法会导致阻塞
            Integer result =  task.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
