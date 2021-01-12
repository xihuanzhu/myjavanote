package com.test2.pstructure;

import java.util.*;

public class PSet {
    public static void main(String[] argv){
        Set<String> set = new HashSet<>();
        set.add("jk");
        set.add("i");
        set.add("like");
        for (String s:set) {
            System.out.println(s);
        }
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhu");
        map.put(2, "xi");
        map.put(3, "huan");

        //method1
        Set<Integer> keys = map.keySet();
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }//也可以foreach

        //method2,效率比较高，因为是把key和value获取在一起
        Set<Map.Entry<Integer, String>> set1 = map.entrySet();
        for (Map.Entry<Integer, String> entry:set1) {
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
