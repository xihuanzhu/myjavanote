package com.test2.pthread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] argv) throws Exception{
        Timer timer = new Timer();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime =  simpleDateFormat.parse("2021-01-03 00:00:00");
        timer.schedule(new LogTimerTask(), firstTime, 1000 * 10);
    }
}
class LogTimerTask extends TimerTask{
    @Override
    public void run() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = simpleDateFormat.format(new Date());
        System.out.println(strTime);
    }
}