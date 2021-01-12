package com.test1.ppackage;
import com.test1.poly.Bird;
/**
 * 包名要求全部小写，包名也是标志符，要按照命名规则
 * 编译时要切换到java文件目录下，编译完成后，要切换到包名上一级(com上一级)，在运行java com.test1.ppackage.Package
 * 直接import就没有那么多事了，放在package语句下class语句之上
 * java.lang.*不需要手动import
 *
 * 访问控制权限修饰符包括：
 *  public：
 *      公开的，任何位置都可以用（要import）
 *  protected：
 *      只能在同一个包下或者不同包下子类访问
 *  缺省：
 *      只能在同一个包下访问
 *  private：
 *      私有的，只能在本类用
 *
 * 类只能public或者缺省，内部类除外
 */
public class Package {
    public static void main(String[] argv){
        System.out.println("in Package");
        //com.test1.poly.Bird bird = new com.test1.poly.Bird();
        Bird bird = new Bird();
    }
}
