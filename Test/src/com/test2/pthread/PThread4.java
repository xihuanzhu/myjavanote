package com.test2.pthread;

public class PThread4 {
    public static void main(String[] argv){
        MMyRunnable mMyRunnable = new MMyRunnable();
        Thread thread = new Thread(mMyRunnable);
        thread.start();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        mMyRunnable.run = false;//采用这种办法终止线程

    }
}
class MMyRunnable implements Runnable{
    public  boolean run = true;
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            if(run){
                System.out.println(Thread.currentThread().getName() + "-->" + i);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }else{
                return;
            }
        }
    }
}
