package com.test2.pio;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 通过IO和Properties
 * 以后经常改变的数据，直接写到文件中，使用程序动态读取，以后只需要改文件，不用改代码，就可以拿到动态信息
 * 类似于以上机制的文件被称为配置文件
 * 当配置文件格式为：
 *      key1=value
 *      key2=value2
 * 此时为属性配置文件，一般以.properties结尾，但不是必须的
 * 其中Properties是专门存放属性配置文件的类
 * 等号旁边不能有空格，等号也可以换成：，但是不建议
 */
public class PIoProperties {
    public static void main(String[] argv) throws Exception{
        FileInputStream fileInputStream= new FileInputStream("src/com/test2/pio/user");
        Properties properties = new Properties();
        properties.load(fileInputStream);//文件中的数据顺着管道加载到map，等号左边为key，右边为value
        String id = properties.getProperty("id");
        System.out.println(id);
    }
}
