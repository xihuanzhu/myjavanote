package com.test1.sstatic;

/**
 * 所有对象都有这个属性，并且这个属性的值不会随着对象而变化，则声明为静态变量
 * 静态变量在类加载的时候初始化，不需要创建对象，内存就在开辟了
 * 静态变量存储在方法区内存当中
 * 静态代码块在类加载时执行，并且只执行一次
 * 静态代码在一个类中可以编写多个，并且遵循自上而下的顺序执行
 * 静态代码块的作用：
 *     1.和具体需求有关，例如项目中要求在类加载的时刻/时机执行代码完成日志的记录，
 *       那么这段记录日志的代码就可以编写到静态代码块当中，完成日志记录
 *     2.静态代码块是java为程序员准备的一个特殊时刻，这个特殊时刻被称为类加载时刻，
 *       若希望在此刻执行一段特殊程序，这段程序可以直接放到静态代码块当中
 * 通常在静态代码块当中完成预备工作，先完成数据的准备工具，例如：初始化连接池，解析XML配置文件
 */
public class Chinese {
    private String id;
    private String name;
    private static String country = "Chinese";

    static {
        System.out.println("static one");
    }
    static {
        System.out.println("static two");
    }

    public Chinese() {
    }

    public Chinese(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        Chinese.country = country;
    }
}
