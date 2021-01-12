package com.test2.pio;

import com.test2.parray.Array;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 通过源代码发现，Serializable接口只是一个标识接口：
 *      public interface Serializeable{
 *
 *      }
 *      尽管什么都没有，但是起到标识的作用，jvm会对实现它的类特殊对待，jvm会为它自动生成序列化版本号
 * transient: 加上之后修饰的变量不参与序列化，反序列化时会直接返回null，因为序列化时不存储它
 * java中是通过什么机制来区分的：
 *      先是通过类名，如果类名不一样，则肯定不是同一类
 *      如果类名相同，靠序列化版本号进行区分，还可以区分不同人写的同一类
 * 序列化版本号的缺陷：不能随意修改代码，修改后必须重新生成序列化，
 * 所以只要类实现了serializable接口，建议固定其序列化版本号，手动固定
 *      private final static long serialVersionUID = 1L; 变量名固定serialVersionUID
 *
 */
public class PObjectOutputStream {
    public static void main(String[] argv) throws IOException {
        ArrayList<Student> arrayList = new ArrayList<>(10);
        arrayList.add(new Student(1, "zhu"));
        arrayList.add(new Student(2, "xi"));
        arrayList.add(new Student(3, "huan"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("./src/com/test2/pio/out"));
        objectOutputStream.writeObject(arrayList);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}
