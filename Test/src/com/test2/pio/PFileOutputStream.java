package com.test2.pio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PFileOutputStream {
    public static void main(String[] argv){
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream("src/com/test2/pio/tt");
            fileOutputStream = new FileOutputStream("src/com/test2/pio/out", true);//true代表附加
            byte[] bytes = new byte[1024 * 1024];
            int count = fileInputStream.read(bytes);
            fileOutputStream.write(bytes, 0, count);//在文件末尾写count个字节，可以用来文件复制¥
            fileOutputStream.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } finally{
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
