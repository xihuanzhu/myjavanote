package com.test1.sstatic;

public class ChineseTest {
    public static void main(String[] argv){
        Chinese chinese = new Chinese("420222", "zxh");
        System.out.println(chinese.getId() + chinese.getName() + chinese.getCountry());
    }
}
