package com.test1.override;

import com.test1.override.Animal;
import com.test1.override.Bird;
import com.test1.override.Cat;

/**
 *  关于java中方法的覆盖：
 *      1.方法覆盖又称为方法重写，英语单词：override/overwrite
 *      2.什么时候使用方法重写：
 *          当父类中的方法已经无法满足子类的业务需求，子类有必要将父类继承过来的方法进行重写，这个
 *          过程被称为方法覆盖
 *      3.什么情况下构成方法的重写
 *          * 方法重写发生在父类和子类之间
 *          * 返回类型相同，方法名相同，形参列表相同
 *          * 访问权限可以更高，不能更低
 *          * 抛出异常不能更多，可以更少
 *      4.static方法不存在覆盖
 *      5.覆盖只针对方法
 */
public class OverrideTest {
    public static void main(String[] argv){
        Animal animal = new Animal();
        animal.move();
        Cat cat = new Cat();
        cat.move();
        Bird bird = new Bird();
        bird.move();
    }
}
