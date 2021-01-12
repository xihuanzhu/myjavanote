package com.test2.pexception;

import java.io.FileNotFoundException;

public class PException {
    public static void main(String[] argv) throws ClassNotFoundException, FileNotFoundException{
        //doSome(); 这里会编译错误，因为ClassNotFoundException是编译时异常
        try {
            doSome1();//尽管这个函数会throws异常，但是除非你的函数里真的有异常(运行时异常？)，不然它后面的语句还是会执行
            //类似于预警机制，不犯错就没效果，犯错就会触发,但是throw是手动的扔出异常，后面就是不会执行，除了加finally
            //输出：after doSome direct after doSome1 after doSome1
            //int c = 10/0; //输出： after doSome  after doSome1
            System.out.println("direct after doSome1");//output
        }catch(FileNotFoundException | ClassCastException e){
            e.getMessage();//获取简单的描述信息
            e.printStackTrace();//打印异常信息的堆栈信息
            throw e;//它要和throws连着用，不然编译不过
            //e.printStackTrace();//打印异常信息的堆栈信息 //不能输出
        }catch (Exception e){

        }finally {
            System.out.println("always output");
        }
        System.out.println("after doSome1");//output
    }
    public static void doSome1() throws ClassNotFoundException, FileNotFoundException{
        doSome();
        System.out.println("after doSome");//output
    }
    public static void doSome() throws ClassNotFoundException, FileNotFoundException {
        //int a = 10/0;
    }
}
