package com.test2.pexception;

public class PException2 {
    public static void main(String[] argv){
        System.out.println(doSome1());//这里输出100，因为java代码是自上而下运行的（铁则），所以先return i，再i++
        //return确实返回上一级，函数也确实结束了，因为return一定是函数结束前最后执行的（铁则），
        // 这里相当于弄了一个临时变量存储开始的i，然后返回临时变量的值，最后i++
        doSome();
        final int a = 0;
        //finalize();它是Object的一个函数，销毁对象，JVM垃圾回收器负责调用
    }
    public static void doSome(){
        try{
            System.out.println("try");
            //return;//它并不能使finally失效
            System.exit(0);//可以使finally失效
        }finally {//finally语句一定会执行，尽管有return，但是不加finally下面的就输出不了
            System.out.println("finally");
        }
    }
    public static int doSome1(){
        int i = 100;
        try{
            return i;
        }finally {
            i++;
        }
    }

}
