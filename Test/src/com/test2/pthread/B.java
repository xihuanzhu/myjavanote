package com.test2.pthread;

public class B {
    public static int t1 = 1;
    int t2 = 2;
    public static int t3 = 1;
    public void fun(){

    }
    public static void main(String[] argv){
        B b = new A();
        B.t3 = 1;
        b.t1 = 2;
        b.t2 = 3;
    }

}
class A extends B{

}
