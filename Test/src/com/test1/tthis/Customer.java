package com.test1.tthis;

/**
 * 关于java中this
 *    存储指向自身的地址,其实就是个引用，存储在JVM的堆内存中
 *    this是对象级别的，每个对象都有属于自己的this
 *    没有static的变量和方法都是实例变量和实例方法，访问时用"引用."，有static为类级的
 *    this只能出现在实例方法中，代表当前对象，可以省略
 *    实例变量不能被static方法访问，因为实例变量是属于对象的，而static是类的
 *    static级想要调用实例级必须得定义对象，不能直接调用实例级，对象级却能直接调用static级的
 *    (假设有static a()方法，则调用方式有a(), 类名.a(), 对象.a(),而且此时就算对象为空，也不会报空指针异常，因为static方法本来就不需要指针指引
 *    表面上你用了对象去调用，其实在执行过程中会把对象名改为类名)
 *    this可以用在哪里：
 *        1.可以使用在实例方法中，代表当前对象[this.]
 *        2.可以使用在构造方法中，通过当前的构造方法调用其他的构造方法[this(实参)]
 *    this()这种语法只能出现在构造函数第一行
 */
public class Customer {
    String name;//实例变量
    public Customer(){
        this("cqw");
    }
    public Customer(String name) {
        this.name = name;
        //Customer a = new Customer("kk");//递归致死
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void shopping(){
        System.out.println(this.name + " is shopping.");//this 可以省略
    }
}
