package com.test2.pinterface;

/**
 * 1. 接口是完全抽象的，抽象类是半抽象的，也可以说接口是特殊的抽象类
 * 2. 接口怎么定义，语法：
 *    [修饰符列表] interface 接口名{}
 * 3. 接口也是一种引用数据类型，编译后会生成class文件
 * 4. 接口支持多继承
 * 5. 接口中只能有常量和抽象方法两部分
 * 6. 接口中都是public修饰的
 * 7. 之所以接口是全抽象是因为它里面不允许存在方法体，但是抽象类里可以有方法体
 */
interface A{
    public static final int PI = 3;//前面三个可以省略，自动加
    public abstract int sum(int a, int b);//前面两个可以省略，自动加
    int sub(int a, int b);
}
interface B{
    int sub(int a, int b);
}
interface C extends A, B{

}
interface D{

}

/**
 * 1. 类和类之间叫继承(extends)，类和接口之间叫实现(implements)
 * 2. 类实现接口时，要全部重写覆盖（实现）接口的方法
 * 3. 类可以同时实现多接口
 * 4. 经过测试，接口与接口之间就算没有继承关系，强制转换是编译也不会报错，但是运行会报错(ClassCastException)，最好在
 *    之前加上instance of判断一下类型
 * 5. 一个类同时实现的接口之间可以互相转换，编译运行都不会报错
 */
public class InterfaceTest implements A, B{
    public int sum(int a, int b){
       return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public static void main(String[] argv){
        //实质还是多态，这怎么能算多态呢(父引用指向子类型，即是多态）
        A a = new InterfaceTest();
        B b = new InterfaceTest();
        //B b2 = (B)a;
        //b2.sub(2, 4);
        //System.out.println(b2.sub(1, 2));
        //D d = (D)b;
    }
}
