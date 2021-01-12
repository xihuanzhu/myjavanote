package com.test2.pstructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CCollection {
    public static void main(String[] argv) {
        Collection c = new ArrayList();
        c.add(1);
        c.add(8.3);
        c.add("hh");
        c.add(new String("hj"));
        //Collection下的通用迭代方法
        Iterator iterator = c.iterator();//一旦集合中结构发生改变，迭代器需要重新获取
        while (iterator.hasNext()) {
            //c.remove("hj");加上就会报错，因为集合结构改变了，但是迭代器没有重新获取
            //iterator.remove();
            System.out.println(iterator.next());
            //iterator.remove(); 这个就可以用来删除
        }
        System.out.println(c.contains("hh"));//true
        System.out.println(c.contains("hj"));//true, 因为底层源码用equals实现的，具体比较结果要根据元素类型来
        //因为有些类型并没有重写equals，比如自定义类，这里String重写了，所以比较值，结果就为True
        c.remove("hj");//删除成功，因为remove底层也调用的equals方法
    }
}
