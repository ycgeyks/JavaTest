package org.example.thread;

public class DeadLock {
    public static void main(String[] args) {
        MyThread a = new MyThread("Thread A");
        MyThread b = new MyThread("Thread B");

        a.start();
        b.start();

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }


}
