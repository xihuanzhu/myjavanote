package com.test2.pthread;

import java.util.ArrayList;
import java.util.List;

public class WaitNotify {
    public static void main(String[] argv) throws Exception{
        List list = new ArrayList();
        Thread thread = new Thread(new Producer(list));
        Thread thread1 = new Thread(new Consumer(list));
        thread.setName("producer");
        thread1.setName("consumer");
        thread.start();
        thread1.sleep(1000);
        thread1.start();
    }
}
class Producer implements Runnable{
    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (list){
                if(list.size() > 0){
                    try{
                        list.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }else {
                    Object o = new Object();
                    list.notify();//
                    list.add(o);
                    System.out.println(Thread.currentThread() + o.toString());
                }
            }
        }
    }
}
class Consumer implements Runnable{
    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (list){
                if(list.size() == 0){
                    try{
                        System.out.println("consumer enter wait");
                        list.wait();
                    }catch (InterruptedException e){
                       e.printStackTrace();
                    }
                }else{
                    Object o = list.remove(0);
                    list.notify();//这个必须要加，不然list对象上的等待的线程永远醒不来
                    System.out.println(Thread.currentThread() + o.toString());
                }
            }
        }
    }
}