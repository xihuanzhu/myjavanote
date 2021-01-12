package com.test2.pthread;

public class Account {
    private String actNo;
    private double balance;

    Object object = new Object();

    public Account(String actNo, double balance) {
        this.actNo = actNo;
        this.balance = balance;
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public  void withdraw(double m){
        /**
         * 假如有t1, t2, t3, t4, t5五个线程，但你只想t1,t2,t3异步
         * 那么你一定要在()中写t1, t2, t3共享的对象，而这个对象对图t4, t5来说不共享
         * 这里共享对象是账户对象,不一定是this，只要是共享对象都行
         * 每个对象都有一把锁，
         * 以下代码原理：
         *    假设有t1，t2两个线程，假设t1先运行，当t1遇到synchronized,会占有同步代码所在共享对象的锁，当t2
         *    遇到该同步代码块时，会等待t1结束归还锁，这样就达到了线程排队执行
         * 这个共享对象一定要选好，一定是你需要排队的线程所共享的对象，也可以是共享对象的成员对象,比如Account的Object对象
         * this换成字符串也行，主要要保证线程之间的对象是共享的，唯一的，但最好不要用字符串，因为整个程序中字符串永远只有一份，
         * 会阻塞很多其他线程，synchronized也可放在withdraw之外
         */
        synchronized (this){
            double before = this.getBalance();
            double after = before - m;
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            this.setBalance(after);
        }
    }

}
