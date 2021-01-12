package com.test2.pannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation2 {
    /**
     * 我们通常在注解中可以定义属性，以下是Annotation2的name属性，看着像方法，但实际上我们称之为属性name
     *
     */
    String name();

    int id();

    String value();

    int aeg() default 15;
}
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Annotation3{
    /**
     * 如果一个属性的名字是value的话，使用注解时属性名可以省略，但是只限于注解只有一个value属性
     * @return
     */
    String value();
}
@Retention(RetentionPolicy.RUNTIME)
@interface Annotation4{
    /**
     * 注解中的属性可以是哪一种类型？
     *    属性的类型可以是：
     *        byte, short, int, long, float, double, boolean, char, String, Class 枚举类型
     *        以及以上每一种数组形式
     * @return
     */
    int age();
    String[] email();

}