package com.test2.preflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectField {
    public static void main(String[] argv){
        try {
            Class studentClass = Class.forName("com.test2.preflect.Student");
            Object object = studentClass.newInstance();
            Field[] fields = studentClass.getDeclaredFields();
            for (Field field:fields
                 ) {
                System.out.println(field.getType());//类型
                System.out.println(field.getName());//成员名
                System.out.println(Modifier.toString(field.getModifiers()));//获取修饰符
            }

            //反射机制反编译class文件
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("class Student{");
            for (Field field:fields
            ) {
                stringBuilder.append("\n\t" + Modifier.toString(field.getModifiers()));
                stringBuilder.append(" " + field.getType() + " " + field.getName() + ";");
            }
            stringBuilder.append("\n" + "}");
            System.out.println(stringBuilder);

            //操作属性,但是私有属性不可访问，除非setAccessible(true)
            Field noField = studentClass.getDeclaredField("no");
            System.out.println(noField.get(object));//0
            noField.set(object, 11);
            System.out.println(noField.get(object));//11
        } catch (ClassNotFoundException | NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
class Student{
    //都是field的对象
    public int no;
    private String name;
    protected int age;
    boolean sex;
}