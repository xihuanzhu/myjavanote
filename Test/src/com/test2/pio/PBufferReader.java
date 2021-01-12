package com.test2.pio;

import java.io.*;

/**
 * BufferedReader
 *    带有缓冲区的字符输入流
 *    使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组，自带缓冲
 */
public class PBufferReader {
    public static void main(String[] argv) throws Exception{
        FileReader fileReader = new FileReader("src/com/test2/pio/tt");//abcdef
        //当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流
        //外部负责包装的这个流，叫做：包装流，还有一个名字叫做：处理流
        //像当前这个程序来说：FileReader就是一个节点流，BufferedReader就是包装流/处理流
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        Reader reader = new InputStreamReader(new FileInputStream("src/com/test2/pio/tt"));

        bufferedReader = new BufferedReader(reader);
        //BufferedWriter类似

        String firstLine = bufferedReader.readLine();//读取一行，不带回车
        System.out.println(firstLine);//abcdef
        String secondLine = bufferedReader.readLine();
        System.out.println(secondLine);//null
        //对于包装流来说，只需要关闭包装流
        bufferedReader.close();
    }
}
