package com.test1.extend;

import com.test1.extend.CreditAccount;

/**
 *  1.继承是面向对象三大特征之一，分别是封装，继承，多态
 *  2.继承的基本作用是：代码复用。但是继承最重要的作用是：有了继承以后才有了以后"方法的覆盖"和"多态机制"。
 *  3.继承的语法格式：
 *      [修饰符列表] class 类名 extends 父类名{
 *          类体 = 属性 + 方法
 *      }
 *  4.java语言中继承只支持单继承，一个类不能同时继承很多类。在c++中支持多继承。
 *  5.关于继承中一些术语：
 *      B类继承A类，其中：
 *          A类称为：父类，基类，超类，superclass
 *          B类称为：子类，派生类，subclass
 *  6.在java语言中子类继承父类哪些数据：
 *      -私有的不支持继承
 *      -构造方法不支持继承
 *      -其他数据都可以支持继承
 *  7.虽然java只支持单继承，但是一个类也可以间接继承其他类，例如：
 *      C extends B{
 *
 *      }
 *      B extends A{
 *
 *      }
 *      C直接继承B类，但间接继承A
 *  8.java语言中假设某一类没有显式地继承任何类，则他默认继承JAVASE库中java.lang.Object类
 */
public class ExtendTest {
    public static void main(String[] argv){
        CreditAccount creditAccount = new CreditAccount();
        creditAccount.setBalance(0.1);
        System.out.println(creditAccount.getBalance());
    }
}
