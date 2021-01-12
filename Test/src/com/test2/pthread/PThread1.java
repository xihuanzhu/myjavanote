package com.test2.pthread;

public class PThread1 {
    public static void main(String[] argv){
        MyRunnable myRunnable = new MyRunnable();
        //Thread thread = new Thread(myRunnable);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    System.out.println("branch" + i);
                }
            }
        });
        thread.start();
        for(int i = 0; i < 100; i++){
            System.out.println("main" + i);
        }
    }
    public static void m1(){
        System.out.println("m1 begin");
    }
}
class MyRunnable implements Runnable{
   @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println("branch" + i);
        }
    }
}
