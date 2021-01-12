package com.test2.pinterface;
class Animal{
}
interface Flyable{
    void fly();
}
class Cat extends Animal implements Flyable{
    public void fly(){
        System.out.println("i cant fly");
    }
}
class Bird extends Animal implements Flyable{
    public void fly(){
        System.out.println("i can fly");
    }
}
public class InterfaceTest2 {
    public static void main(String[] argv){
        Flyable flyable = new Cat();
        flyable.fly();
        Flyable flyable1 = new Bird();
        flyable1.fly();
    }
}
