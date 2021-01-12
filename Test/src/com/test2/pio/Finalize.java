package com.test2.pio;

public class Finalize {
    @Override
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("rewrite finalize");
    }
    public static void main(String[] argv) throws Throwable{
        new Finalize().finalize();
    }
}
