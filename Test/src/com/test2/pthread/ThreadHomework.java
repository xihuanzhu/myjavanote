package com.test2.pthread;

public class ThreadHomework {
    public static void main(String[] argv) throws Exception{
        Num i = new Num(1);
        Thread thread = new Thread(new Odd(i));
        Thread thread1 = new Thread(new Even(i));
        thread.setName("Odd");
        thread1.setName("Even");
        thread.start();
        thread1.sleep(1000);
        thread1.start();
    }
}
class Even implements Runnable{
    private Num i;

    public Even(Num i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true){
            if(i.k > 100){
                break;
            }
            synchronized (i){
                if(i.k % 2 == 1){
                    try{
                        i.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }else {
                    i.notify();//
                    System.out.println(Thread.currentThread() + String.valueOf(i.k));
                    i.k++;
                }
            }
        }
    }
}
class Odd implements Runnable{
    private Num i;

    public Odd(Num i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true){
            if(i.k > 100){
                break;
            }
            synchronized (i){
                if(i.k % 2 == 0){
                    try{
                        i.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }else{
                    System.out.println(Thread.currentThread() + String.valueOf(i.k));
                    i.k++;
                    i.notify();//这个必须要加，不然list对象上的等待的线程永远醒不来
                }
            }
        }
    }
}
class Num{
    public int k;

    public Num(int i) {
        this.k = i;
    }
}