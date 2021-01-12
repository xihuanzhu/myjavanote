package com.test2.preflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AbsoluteReflect {
    public static void main(String[] argv){
        try {
            Class c = Class.forName("com.test2.preflect.TT1");
            System.out.println(c);
            /**
             * 这里的com.test2.preflect.TT1是相对路径，一旦目录发生改变，就会报错
             * 这时考虑用绝对路径
             */
            System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
            //file:/Users/xihuanzhu/IdeaProjects/Test/out/production/javase/
            System.out.println(Thread.currentThread().getContextClassLoader().getResource("com/test2/preflect/Reflect2.class"));
            //file:/Users/xihuanzhu/IdeaProjects/Test/out/production/javase/com/test2/preflect/Reflect2.class
            String s = Thread.currentThread().getContextClassLoader().getResource("com/test2/preflect/Reflect2.class").getPath();
            System.out.println(s);
            ///Users/xihuanzhu/IdeaProjects/Test/out/production/javase/com/test2/preflect/Reflect2.class
            //System.out.println(s.substring(s.indexOf("com"), s.lastIndexOf('.')).replace('/', '.'));
            //com.test2.preflect.Reflect2
            c = Class.forName(s.substring(s.indexOf("com"), s.lastIndexOf('.')).replace('/', '.'));
            /**
             *  如果直接获取class文件路径，需要对路径进行处理，会受到包名影响，所以properties文件的作用体现了
             *  去掉规则映射，直接手动修改，需要主要的是类文件目录下项目直属包名，但是运行文件目录下还有src一层
             *  但是整体来说根目录都是项目名下一层
             */
//            s = Thread.currentThread().getContextClassLoader().getResource("pa.properties").getPath();
//            FileReader reader = new FileReader(s);
            //直接以流的形式返回
            InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("pa.properties");
            Properties properties = new Properties();
            properties.load(reader);
            reader.close();
            System.out.println(properties.getProperty("class_name"));
            c = Class.forName(properties.getProperty("class_name"));
            Object object = c.newInstance();//调用的无参构造函数
            System.out.println(object);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class TT1{
    static {
        System.out.println("static code run");
    }
    public TT1() {
        System.out.println("construction");
    }

}