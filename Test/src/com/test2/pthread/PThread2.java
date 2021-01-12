package com.test2.pthread;

/**
 *   关于线程sleep方法
 *   static void sleep(long millis), 跟对象没关系
 *   主要是休眠sleep所在线程
 *
 */
public class PThread2 {
    public static void main(String[] argv){
        Thread thread = new MMyThread();
        thread.start();
        try{
            thread.sleep(2000);//MMyThread线程不会休眠，主线程休眠，因为sleep只跟类有关，此时在main中
            thread.interrupt();//中断某线程的睡眠，并catch InterruptedException，
            // main函数之后的代码不一定会在他之后执行，可能在它之前，会隔一段时间才会运行他
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("hh");
//        for(int i = 0; i < 100; i++){
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("branch" + i);
//        }
    }
}
class MMyThread extends Thread{
    @Override
    public void run() {
        /**
         * run里面不能throws异常，因为子类不能抛出比父类多的异常，Thread的run中并未抛出任何异常
         */
        try{
            Thread.sleep(50000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        for(int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println("branch" + i);
        }
    }
}
