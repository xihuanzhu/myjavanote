package com.test;

public class ClassTest{
    public static void main(String[] argv) {
        String property;
        Student s = new Student();
        int stuNo = s.no;
        User user = new User();
        s.user = user;
        System.out.println("姓名：" + s.user.name);
        user.name = "zhuxihuan";
        System.out.println("姓名：" + s.user.name);
    }
    static void method(){
        
    }
}
class Student{
    int no;
    User user;
}