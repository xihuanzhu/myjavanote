package com.test2.pinteger;

public class IInteger {
    public static void main(String[] argv){
        Integer integer = new Integer(123);//装箱
        Integer integer1 = 1;//自动装箱
        float f = integer.floatValue();//拆箱
        float i = integer;//自动拆箱，== 不会触发自动拆箱机制

        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);//false
        /**
         * 为什么这里结果会不一样，因为java中为了执行效率，将-128 ～ 127之间的包装对象提前创建好，放到了
         * 了方法区的整数型常量池当中了
         */
        a = 127;
        b = 127;
        System.out.println(a == b);//true

        int v = Integer.parseInt("32");

        /**
         *  int -> String : 1 + ""   //   String.valueOf
         *  String -> int : Integer.parseInt
         *  int -> Integer : 装箱 // Integer.valueOf
         *  Integer -> int : 拆箱 // inValue()
         *  String -> Integer : Integer.valueOf
         *  Integer -> String : String.valueOf
         */
    }
}
