package com.test1.poly;

/**
 * 关于java语言中的多态语法机制：
 *  1.Animal,Cat,Bird之间的关系：
 *      Cat继承Animal， Bird继承Animal，Cat和Bird无任何继承关系
 *  2.关于多态中涉及到的几个概念：
 *      * 向上转型(upcasting)
 *          子类型 --> 父类型
 *          又被称为：自动类型转换
 *      * 向下转型(downcasting)
 *          父类型 --> 子类型
 *          又被称为：强制类型转换
 *
 */
public class PolyTest {
    public static void main(String[] argv){
        /**
         * 1.编译阶段编译器检查animal这个引用的数据类型为Animal,由于Animal.class字节码当中
         *     有move()方法，所以编译通过了，这个过程我们称为静态绑定，编译阶段绑定，只有静态绑定成功后才有后续的运行
         * 2.在程序运行阶段，JVM堆内存中真实创建的是Cat对象，那么以下程序在运行阶段一定会调用Cat对象的move方法，此时
         *     发生了程序的动态绑定，运行阶段绑定
         * 3.无论Cat类有没有重写move方法，运行阶段一定调用的是Cat对象的move方法，因为底层真实对象就是Cat对象
         * 4.父类型引用指向子类型对象这种机制导致程序存在编译阶段绑定和运行阶段绑定两种不同的形态/状态，这种机制可以称为多态
         * 5.当调用的是子类型中特有的方法，需要向下强制类型转型
         */
        Animal animal = new Cat();
        animal.move();//输出是cat的move，因为指的是cat的堆内存
        Cat animal2 = (Cat)animal;
        animal2.scratch();
        /**
         * 怎么解决ClassCastException：使用instanceof 数据类型名
         * 向下转型中之所以会出现编译通过运行报错，是因为存在多子一父，父亲给儿子的可能只是从另一个儿子手上拿来的
         * 但是因为不会存在多父，所以向上转型编译只要通过，运行一定会通过
         */
        //Bird animal3 = (Bird)animal;//编译通过，但是运行错误，因为堆内存中实际存在的是Cat类数据，但是Cat和Bird并无任何直接关系
        if(animal instanceof Bird){
            Bird animal3 = (Bird)animal;
            animal3.move();
        }else{
            System.out.println("type isn't match");
        }
        /**
         *  多态的作用：
         *     降低程序的耦合度，提高程序的扩展力
         *     面向更加抽象的编程，而不是面向具体编程，减少了重载的使用
         */
        Master master = new Master();
        Animal animal4 = new Cat();
        master.feed(animal4);
        animal4 = new Bird();
        master.feed(animal4);
    }
}
