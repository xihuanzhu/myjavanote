package com.test2.pstring;

/**
 * 1. String一旦定义则不可改变，存储在方法区字符串常量池当中，如"abc","hg"
 * 2. 显式字符串一旦建立，只要值相同那么不会新建，垃圾回收器也不会回收
 */
public class SString {
    public static void main(String[] argv){
        String s1 = "abc";
        //这里定义了三个字符串常量池
        String S2 = "jk" + "like";
        //这里s3指向堆内存，堆内存指向方法区中"hdg"的常量池
        String s3 = new String("hdg");
        char [] arr = {'a', 'b', 'c'};
        byte [] arr1 = {1, 2};
        String s4 = new String(arr1, 1, 1);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("f");
        stringBuffer.append('b');
        System.out.println(stringBuffer.toString());
    }
}
