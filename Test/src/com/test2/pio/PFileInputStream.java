package com.test2.pio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PFileInputStream {
    public static void main(String[] argv){
        FileInputStream fileInputStream = null;
        try{
            //fileInputStream = new FileInputStream("/xihuanzhu/IdeaProjects/Test/src/com/test2/pio/tt");
            //说明idea运行时默认在项目名称之下，与src同级
            //文件内容：abcdef
            fileInputStream = new FileInputStream("src/com/test2/pio/tt");
//            int data;
//            while((data = fileInputStream.read()) != -1){
//                System.out.println(data);
//            }
            byte[] bytes = new byte[4];
            int count = fileInputStream.read(bytes);//返回成功读到的字节数
            System.out.println(new String(bytes));//abcd
            System.out.println((fileInputStream.available()));//返回剩余没读到字节数
            fileInputStream.skip(1);//跳过n个字符
            count = fileInputStream.read(bytes);//返回成功读到的字节数
            System.out.println(new String(bytes));//efcd，因为第二次读的时候只能用读取两个字符，就会残留第一次的cd
            //所以要用读到的字节数来限定转换字节数
            System.out.println(new String(bytes, 0, count));//ef
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

    }
}
