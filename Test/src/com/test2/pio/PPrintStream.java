package com.test2.pio;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PPrintStream {
    public PPrintStream() {
    }

    public static void main(String[] argv) throws Exception{
        PrintStream printStream = System.out;
        printStream.println("zhuxihuan");//不就是System.out.println

        //改变PrintStream的输出方向,日志文件就是这么干的
        printStream = new PrintStream(new FileOutputStream("src/com/test2/pio/out"));
        printStream.println("i have a apple");

    }
}
