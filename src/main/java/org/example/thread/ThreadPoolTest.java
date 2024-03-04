package org.example.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }

    public static void main(String[] args) {
//        ExecutorService pool1 = Executors.newCachedThreadPool();
        ExecutorService pool1 = Executors.newFixedThreadPool(3);

        pool1.submit(new ThreadPoolTest());
        pool1.submit(new ThreadPoolTest());
        pool1.submit(new ThreadPoolTest());
        pool1.submit(new ThreadPoolTest());
        pool1.submit(new ThreadPoolTest());
        pool1.submit(new ThreadPoolTest());

        pool1.shutdown();
    }
}
