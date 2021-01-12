package com.test1.tthis;

public class User {
    /**
     * 封装的步骤:
     *   1.所有属性私有化，使用private关键字进行修饰，private表示私有的，修饰的所有数据只能在本类中访问。
     *   2.对外提供简单的操作入口，也就是说以后外部程序想要访问age属性，必须通过这些简单的入口进行访问：
     *       对外提供两个公开的方法，分别是set和get方法
     *
     * 构造方法：
     *   1.构造方法又被称为构造函数/构造器/Constructor
     *   2.构造方法语法结构:
     *       [修饰符列表] 构造方法名(形式参数列表){
     *           构造方法体
     *       }
     *   3.普通方法的语法结构:
     *      [修饰符列表] 返回值类型 方法名(形式参数列表){
     *           方法体
     *      }
     *   4.构造方法的方法名必须和类名一致
     *   5.构造方法的作用就是创建对象,并初始化实例变量的内存空间
     *   6.构造方法的调用: new 构造方法名(实参列表)
     *   7.每个构造方法都有返回值，但是不用明写，类型一般为该类本身类型
     */
    String name;
    private int age;

    public User(){
        this("cqw");//可以调用该对象的其他构造函数
        System.out.println("in default constructor");
    }
    public User(int a){
        age = a;
        System.out.println(" in constructor with int");
    }
    public  User(String n){
        name = n;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int wage){
        if(wage < 0){
            System.out.println("age cant be less 0");
            return;
        }
        age = wage;
    }
}
