package com.test1.ffinal;

/**
 *  1.final是一个关键字，表示最终的，不可变的。
 *  2.final修饰的类无法被继承
 *  3.final修饰的方法无法被继承
 *  4.final修饰的变量一旦赋值之后，不可重新赋值
 *  5.final修饰的实例变量,实例变量必须要有手动默认值，不能用系统默认的，如果不在最开始赋值则会编译错误（除非你构造函数里赋值了）
 *  6.final修饰的引用,一旦指向某个堆地址，不可修改其指向，但是指向堆地址中的内容可以改变
 */
public class FinalTest {
    /**
     * 成员变量之实例变量
     * 实例变量必须要有手动默认值 + final修饰的变量一旦赋值不能重新赋值
     * 综合考虑，java最终考虑使用final修饰之后，必须手动赋值，不能采用系统默认值
     */

    //解决方案一：
    final int age;//编译错误
    public FinalTest(int age) {
       this.age = age;
    }
    //解决方案二：
    final int money = 9;

    //常量的定义：public static final type name = value
    //常量都要大写，每个单词之间用下划线连接
    public static final String COUNTRY = "Chinese";
    public static void main(String[] argv){
        final int a;
        final User user = new User();
        //user = new User();错误
        user.setId(10);
    }
}