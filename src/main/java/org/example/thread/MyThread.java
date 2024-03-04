package org.example.thread;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    static Object A = new Object();
    static Object B = new Object();
    public void run() {
        while(true){
            if ("Thread A".equals(getName())){
                synchronized (A){
                    System.out.println("got thread A need thread B");
                    synchronized (B){
                        System.out.println("over!");
                    }
                }
            }else{
                synchronized (B){
                    System.out.println("got thread B need thread A");
                    synchronized (A){
                        System.out.println("over!!");
                    }
                }
            }
        }
    }
}
