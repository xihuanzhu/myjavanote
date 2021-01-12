package com.test2.pio;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PObjectInputStream {
    public static void main(String[] argv) throws Exception{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/com/test2/pio/out"));
        System.out.println(objectInputStream.readObject().toString());
        objectInputStream.close();
    }
}
