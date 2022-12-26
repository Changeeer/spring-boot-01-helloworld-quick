package com.mytest.thread;

import java.util.Date;

public class TestThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + new Date());
    }

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.start();
    }
}

//
//class SynchronizedObjectLock implements Runnable {
//    static SynchronizedObjectLock instence = new SynchronizedObjectLock();
//
//    static Object lock = new Object();
//
//    @Override
//    public void run() {
//        // 同步代码块形式——锁为this,两个线程使用的锁是一样的,线程1必须要等到线程0释放了该锁后，才能执行
////        synchronized (this) {
//        synchronized (lock) {
//            System.out.println("我是线程" + Thread.currentThread().getName());
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "结束");
//        }
//    }
//
//    public static void main(String[] args) {
//        Thread t1 = new Thread(instence);
//        Thread t2 = new Thread(instence);
//        t1.start();
//        t2.start();
//    }
//}


class SynchronizedObjectLock implements Runnable {
    static SynchronizedObjectLock instence1 = new SynchronizedObjectLock();
    static SynchronizedObjectLock instence2 = new SynchronizedObjectLock();

    @Override
    public void run() {
        // 所有线程需要的锁都是同一把
        synchronized(SynchronizedObjectLock.class){
            System.out.println("我是线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "结束");
        }
    }

    public static void main(String[] args) {
        // 此处特地传入2个不同的对象
        Thread t1 = new Thread(instence1);
        Thread t2 = new Thread(instence2);
        t1.start();
        t2.start();
    }
}
