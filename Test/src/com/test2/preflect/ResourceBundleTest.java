package com.test2.preflect;

import java.util.ResourceBundle;

public class ResourceBundleTest {
    public static void main(String[] argv){
        //更方便获取properties属性的方法
        //资源绑定器，只能绑定properties文件，这个文件必须在类路径下，但是在写路径时扩展名不用写
        ResourceBundle resourceBundle = ResourceBundle.getBundle("pa");
        String className = resourceBundle.getString("class_name");
        System.out.println(className);
    }
}
