package com.test2.pstructure;

import com.test1.poly.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Plist {
    public static void main(String[] argv){
        List list = new LinkedList();//它的内部实现是双向链表，没有初始容量
        list.add(1);
        list.add(9.8);
        list.add("hjh");
        list.add(2, 2);
        /**
         * 尽管LinkedList可以用下标访问，但是实质也是从头索引的，访问还是没有ArrayList效率高，但是增删效率高
         */
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        Collections.synchronizedList(list);//把线程不安全变成线程安全

        List<Animal> list1 = new ArrayList<Animal>();
        // 泛型，加了后只能用一种类型，这里是animal，
        //泛型只在语法机制，只在程序编译阶段起作用，只是给编译器参考的。

        List<Animal> list2 = new ArrayList<>();
        //自动类型推断机制，又称为砖石表达式

        MyGeneric<String> myGeneric = new MyGeneric<>();
        myGeneric.get();

        int[] array = {1, 2, 2, 2,3};
        for (int  i:array) {
            System.out.println(i);
        }
        for (Object i:list) {
            System.out.println(i);
        }
    }
}
//自定义泛型，A是一个标识符，随便写，只是为了只用某一类型
class MyGeneric<A>{
    public A get(){
        return null;
    }
}