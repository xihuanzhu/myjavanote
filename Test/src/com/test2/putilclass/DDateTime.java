package com.test2.putilclass;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DDateTime {
    public static void main(String[] argv){
        //date转字符串格式
        Date nowTime = new Date();
        System.out.println(nowTime);//Sat Dec 19 20:43:03 CST 2020
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd:mm:ss SSS");
        System.out.println(sdf.format(nowTime)); //2020-12-19:43:03 281

        Date yTime = new Date(33);
        System.out.println(sdf.format(yTime));//1970-01-01:00:00 033

        //字符串转date
        String string = "2016-10-24 21:59:06";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            //这句话如果不加try catch，就算字符串和SimpleDateFormat的格式一致，parse也会报java.text.ParseException的错
            System.out.println(sdf2.parse(string)); //Mon Oct 24 21:59:06 CST 2016
        }catch(ParseException e){
            e.printStackTrace();
        }
        long nowTimeMill = System.currentTimeMillis();//计算从计算机起始时间(1970.1.1)到目前时间的毫秒数
        System.out.println(nowTimeMill);
    }
}
