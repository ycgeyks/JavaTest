package org.example.thread;

public class syncTest {
    private static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {

        new Thread(()->{
            int i = 100;
            while(i<200){
                i++;
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        Thread.sleep(10000);

        new Thread(()->{
            int i = 0;
            while(i<100){
                i++;
                System.out.println(i);
            }
        }).start();

    }
}
