package com.test2.pstructure;

import java.util.*;

class ExampleCompare implements Comparator<Example> {
    @Override
    public int compare(Example o1, Example o2) {
        return o1.num - o2.num;
    }
}

public class PTreeMap {
    public static void main(String[] argv){
        TreeMap<Example, String> treeMap = new TreeMap(new Comparator<Example>() {
            @Override
            public int compare(Example o1, Example o2) {
                return o2.num - o1.num;
            }
        });
        treeMap.put(new Example(4), "first");
        treeMap.put(new Example(2), "second");
        treeMap.put(new Example(3), "third");
        treeMap.put(new Example(1), "over_first");
        Set<Map.Entry<Example, String>> set = treeMap.entrySet();
        for(Map.Entry<Example, String> ss: set){
            System.out.println(ss.getKey().toString());
        }
    }
}
class Example implements Comparable<Example>{
    int num;

    public Example(int num) {
        this.num = num;
    }

    public int compareTo(Example o) {
        return this.num - o.num;
    }

    @Override
    public String toString() {
        return "Example{" +
                "num=" + num +
                '}';
    }
}