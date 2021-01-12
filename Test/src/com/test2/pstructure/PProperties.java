package com.test2.pstructure;

import java.util.Properties;

public class PProperties {
    public static void main(String[] argv){
        Properties properties = new Properties();
        properties.setProperty("zhu", "uhz");
        System.out.println(properties.getProperty("zhu"));
    }
}
