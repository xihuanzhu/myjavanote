package com.test2.pthread;

public class PThread {
    public static void main(String[] argv){
        Method method = new Method();

        /**
         * method.start();
         * 在JVM中开辟一个新的栈空间，这段代码任务完成后，瞬间就结束了；
         * 这段代码的任务只是为了开辟一个新的栈空间，start()方法就结束了。线程就启动成功了
         * 启动成功的线程会自动调用run方法，并且run方法在分支栈的底部
         * main方法在主栈的栈底，两者平级的
         */
        method.start();
        //method.run(); 不会新建一个线程，还是在主线程中

        for(int i = 0; i < 100; i++){
            System.out.println("main" + i);
        }
    }
    public static void m1(){
        System.out.println("m1 begin");
    }
}
class Method extends Thread{
    @Override
    public void run() {
        //super.run();
        for(int i = 0; i < 100; i++){
            System.out.println("branch " + i);
        }
    }
}
