package com.test2.pannotation;
@Annotation3("hh")
public class Annotation1 {
    public static void main(String[] argv){
        A a = new A();
        a.doSome("hh");
        doS();

    }

    @Annotation2(name="test", id=1, value = "kk")//这里之所以age不需要写，因为他有默认值，多个属性之间用，隔开
    public static void doS(){

    }

    @Annotation3("hh")
    public void doSS(){

    }
   // @Annotation4(age = 1, email = {})
    @Annotation4(age = 2, email = "jj")//数组中只有一个元素，花括号能省略
    int a;
}
