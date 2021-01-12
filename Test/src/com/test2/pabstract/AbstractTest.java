package com.test2.pabstract;
/**
 * 1. 抽象类定义：在正常类之间加abstract
 * 2. 和final不能同时出现,不能同时修饰类
 * 3. 抽象类的子类可以是抽象类
 * 4. 抽象类可以有构造方法，供子类使用
 * 5. 抽象方法表示没有实现的方法，一般跟方法声明一样，加上;
 * 6. 抽象类中不一定要有抽象方法，也可以有非抽象方法，抽象方法必须出现在抽象类中，非抽象子类必须实现抽象类中的抽象方法
 */

abstract  class User{
   public  abstract void some();
   public static final int PI = 3;
   public void hh(){

    }
}
class Student extends User{
    public void some(){
        System.out.println("in Student");
    }
    public native void touch();
}
public class AbstractTest {
    public static void main(String[] argv){
        //面向抽象编程，静态编译时指的是User的，动态绑定时指的是Student
        User user = new Student();
        user.some();
    }
}
