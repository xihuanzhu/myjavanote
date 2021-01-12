package com.test2.pthread;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThirdThread {
    public static void main(String[] argv) throws Exception{
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("call method begin");
                Thread.sleep(1000 * 10);
                System.out.println("call method end");
                int a = 10;
                int b= 20;
                return a + b;
            }
        });
        Thread thread = new Thread(task);
        thread.start();
        Object object = task.get();//会导致当前线程阻塞，因为要等待线程结束才能获取结果
        System.out.println(object.toString());
        System.out.println("hello world");
    }
}
