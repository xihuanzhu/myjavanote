package com.test1.tthis;

public class Base {
    public static void main(String[] argv) {
        //System.out.println("Hello World");
        User user = new User();
        System.out.println(user.getAge());//0
        user.setAge(10);
        System.out.println(user.getAge());//10
        add(user);
        System.out.println(user.getAge());//11

        Customer customer = new Customer("zxh");
        customer.shopping();
        //类定义里定义自身对象，并不会造成，无限循环，因为new对象只会调用构造函数，你在main里定义对象并不会造成递归
        Base b = new Base();
        b.run();
        b.doSome();
        b = null;
        b.doSome();
    }
    public static void add(User u){
        u.setAge(u.getAge() + 1);
    }
    public static  void doSome(){
        System.out.println("do some");
    }
    public void run(){
        User j = new User();
        add(j);//也可以加上类名
        System.out.println("not static");
    }
}
