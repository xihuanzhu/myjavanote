package com.test2.preflect;

/**
 * 使用反射机制来创建实例，更加灵活，具体体现在：
 *    用properties文件或者其他文件存储类名，比如com.test2.preflect.T，读取之后用一个代码读取并创建实例，
 *    这样可以很大解耦合读取代码和properties之间的联系，使其更加灵活，这样换别的类的时候只用改变properties文件
 *    比如下面代码中的com.test2.preflect.TT就可以读取，使下面代码更加灵活
 */
public class Reflect2 {
    public static void main(String[] argv){
        try {
            Class c = Class.forName("com.test2.preflect.TT");
            //单独运行这个输出 static code run，因为它只是类加载，会执行static代码
            //Object object = c.newInstance();//调用的无参构造函数
            //System.out.println(object);//输出 construction  com.test2.preflect.TT@6e0be858
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }
    }
}
class TT{
    static {
        System.out.println("static code run");
    }
    public TT() {
        System.out.println("construction");
    }

}