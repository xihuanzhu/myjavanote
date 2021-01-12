package com.test2.pthread;

public class PThread3 {
    public static void main(String[] argv){
        MyThread myThread = new MyThread();
        myThread.setName("newName");
        String name = myThread.getName();//默认Thread-0
        System.out.println(name);
        myThread.start();
        try{
            myThread.sleep(2000);//MMyThread线程不会休眠，主线程休眠，因为sleep只跟类有关，此时在main中
            myThread.stop();//中断某线程,会导致数据丢失，不推荐
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Thread thread = Thread.currentThread();//获取当前线程
        System.out.println(thread.getName());//主线程名字main

    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        for(int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println("branch" + i);
        }
    }
}
