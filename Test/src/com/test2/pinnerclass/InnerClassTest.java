package com.test2.pinnerclass;

public class InnerClassTest {
    static class Inner1{

    }
    class Inner2{

    }
    public void doSome(){
        class Inner3{

        }
    }
    public static void main(String[] argv){
        Math math = new Math();
        //math.mySum(new ComputeClass(), 1, 2); 正常写法
        //匿名内部类,不建议使用匿名内部类，不可重用，代码乱
        math.mySum(new Compute() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        }, 1, 2);
    }
}
interface Compute{
    int sum(int a, int b);
}

class ComputeClass implements Compute{
    public int sum(int a, int b){
        return a + b;
    }
}
class Math{
    public void mySum(Compute c, int a, int b){
        int retValue = c.sum(a, b);
        System.out.println(retValue);
    }
}
