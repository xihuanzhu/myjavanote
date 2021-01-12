package com.test2.preflect;

import java.util.Date;

public class Reflect {
    public static void main(String[] argv){
        //method1
        /**
         * Class.forName()
         *   1.静态方法
         *   2.方法的参数是一个字符串
         *   3.字符串需要的是一个完整的类名
         *   4.完整类名必须要带有包名，java.lang包也不能省略
         */
        Class c1 = null;
        try {
            c1 = Class.forName("java.lang.String");
            Class c2 = Class.forName("java.util.Date");
            Class c3 = Class.forName("java.lang.Integer");
            Class c4 = Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //method2
        String s = "abc";
        Class x  = s.getClass();//x代表String.class字节码文件，x代表String类型
        String s1 = "bcd";
        Class x1 = s1.getClass();
        System.out.println(x == c1);//true
        System.out.println(x == x1);//true

        //method3
        Class a = String.class;
        Class b = Date.class;
    }
}
