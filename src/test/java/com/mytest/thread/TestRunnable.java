package com.mytest.thread;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + new Date());
        try {
            TimeUnit.SECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new TestRunnable());
        thread.start();
    }
}
