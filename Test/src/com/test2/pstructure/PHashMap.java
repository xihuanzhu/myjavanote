package com.test2.pstructure;

import java.util.HashMap;
import java.util.Map;

public class PHashMap {
    public static void main(String[] argv){
        Map<String, Integer> map = new HashMap();
        map.put(null, null);
        map.get(null);
    }
}
class HashMap1{
    /**
     * HashMap内部实现
     * @param <K>
     * @param <V>
     */
    Node[] table;
    static class Node<K,V>{
        int hash;//用key调用hashcode算的hash值，然后通过hash函数或者hash算法将hash值转为数组下标
        K key;
        V value;
        Node next;
    }
}
/**
 * map.put(key,value)实现原理：
 *    将值封装为一个node，将key映射为数组下标，
 *        如果此位置无任何元素，直接把该node加到该位置
 *        如果此位置有链表，则依次与链表元素的key进行equals，
 *           如果全部返回为false，直接把node加入到链表末尾
 *           如果其中有返回true，那么这个旧node的值将会被覆盖
 *
 * map.get(key)实现原理：
 *    先计算key的数组下标，
 *      如果这个位置什么也没有，直接返回null
 *      如果有链表，依次与链表元素的key进行equals，
 *          只要其中有一个返回true，返回对应value
 *          否则，返回null
 *
 * 因为调用了hashcode和equals，所以HashSet和hashMap的元素要重写这俩函数，
 * HashMap数组元素链表中的每个元素hash值相等
 * HashMap散列不均匀：
 *     hash值过多（每个不一样，和一维数组一样，
 *     hash值过少（每个都一样，和链表一样
 * HashMap只有散列均匀才能发挥出数组和链表的综合优点
 * HashMap默认初始容量16，当默认加载因子到达0.75时，也就是容量占满75%时扩容，
 * HashMap初始容量最好设为2的次方，这样能散列均匀
 */