package com.test2.putilclass;

import java.math.BigDecimal;
import java.util.Random;

public class BBigDecimal {
    public static void main(String[] argv){
        BigDecimal v1 = new BigDecimal("56"); //超高精度

        Random random = new Random();
        int num = random.nextInt();//产生int范围内随机数
        int num1 = random.nextInt(102);//产生0～102范围内(不包含102)随机数
    }
}
