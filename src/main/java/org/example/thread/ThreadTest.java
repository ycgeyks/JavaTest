package org.example.thread;

public class ThreadTest {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread producerThread = new Thread(new Producer(sharedResource));
        Thread consumerThread = new Thread(new Consumer(sharedResource));

        consumerThread.start();
        producerThread.start();
    }
}
