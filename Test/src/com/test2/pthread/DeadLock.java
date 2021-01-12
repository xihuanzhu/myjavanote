package com.test2.pthread;

public class DeadLock {
    public static void main(String[] argv){
        Object o1 = new Object();
        Object o2 = new Object();
        Thread thread = new MyThread1(o1, o2);
        Thread thread1 = new MyThread2(o1, o2);

        thread.start();
        thread1.start();
    }
}
class MyThread1 extends Thread{
    Object object;
    Object object1;
    public MyThread1(Object o1, Object o2){
        this.object = o1;
        this.object1 = o2;
    }

    @Override
    public void run() {
        synchronized (object){
            synchronized (object1){

            }
        }
    }
}
class MyThread2 extends Thread{
    Object object;
    Object object1;
    public MyThread2(Object o1, Object o2){
        this.object = o1;
        this.object1 = o2;
    }

    @Override
    public void run() {
        synchronized (object1){
            synchronized (object){

            }
        }
    }
}