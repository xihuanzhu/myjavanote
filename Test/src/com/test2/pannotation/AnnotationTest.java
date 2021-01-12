package com.test2.pannotation;
/**
 * 1. 注解，或者叫做注释，英文单词是: Annotation
 * 2. 注解Annotation是一种引用数据类型。编译之后也是生成xxx.class文件
 * 3. 怎么自定义注解呢？语法格式？
 *      [修饰符列表] @interface 注解类型名{
 *
 *      }
 * 4. 注解怎么使用，用在什么地方？
 *       第一：注解使用时的语法格式是：@注解类型名
 *       第二：注解可以出现在类上，属性上，方法上，变量上等，还可以出现在注解类型上
 * 5.默认情况下注解可以出现在任意位置
 * 6.java常用内置注解：
 *    * @Override :只能注解方法，是给编译器参考的，和运行阶段没有关系，凡是java中带有这个注解的，
 *                 编译器会进行编译检查，如果这个方法不是重写父类的方法，编译器报错，可以不加，但加上更好
 *    * @Deprecated: 表示某某已过时,已有新的方法，可以出现在任意位置，甚至构造函数上
 * 7.元注解：用来标注"注解类型"的注解，称为元注解。常用的元注解有：
 *      Target:用来标注被标注的注解只能出现在哪里
 *           @Target（ElementType.METHOD): 表示该注解只用于方法
 *      Retention:用来标注被标注的注解保存在哪里
 *           @Retention(RetentionPolicy.SOURCE): 表示该注解只保留在java源文件中
 *           @Retention(RetentionPolicy.CLASS): 表示该注解被保存在class文件中
 *           @Retention(RetentionPolicy.RUNTIME): 表示该注解被保存在class文件中，并且可以被反射机制所读取
 * 8. 注解的作用：作为程序中的一种标记/注释，可以用来规则化所修饰东西，比如通过注解来要求类中必须存在某某属性
 */
public @interface AnnotationTest {

}
class A{
    @AnnotationTest
    int a;

    @Override
    public String toString() {
        return super.toString();
    }
    @Deprecated
    public static void doSome(@AnnotationTest String s){

    }
}
