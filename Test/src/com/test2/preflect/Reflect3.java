package com.test2.preflect;

public class Reflect3 {
    public static void main(String[] argv){
        try {
            Class stringClass = Class.forName("java.lang.String");
            //获取String的父类
            Class superClass = stringClass.getSuperclass();
            System.out.println(superClass.getSimpleName());

            //获取所有接口
            Class[] interfaces = stringClass.getInterfaces();
            for(Class in : interfaces){
                System.out.println(in.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

