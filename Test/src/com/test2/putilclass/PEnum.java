package com.test2.putilclass;

public class PEnum {
    public static void main(String[] argv){
        Integer a;
    }
}

/**
 * enum也是一种引用数据类型，编译时会生成class文件
 * 低版本JDK switch只支持int
 * 高版本JDK switch支持int， String， 枚举enum
 */
enum Result{
    SUCCESS, FAILURE
}
