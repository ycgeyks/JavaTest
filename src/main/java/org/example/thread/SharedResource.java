package org.example.thread;

public class SharedResource {
    private int data;
    private boolean produced;

    public synchronized void produce(int value) {
        while (produced) {
            try {
                wait(); // 等待消费者消费数据
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        produced = true;
        System.out.println("Produced: " + value);
        notify(); // 唤醒消费者
    }

    public synchronized int consume() {
        while (!produced) {
            try {
                wait(); // 等待生产者生产数据
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        produced = false;
        System.out.println("Consumed: " + data);
        notify(); // 唤醒生产者
        return data;
    }
}
