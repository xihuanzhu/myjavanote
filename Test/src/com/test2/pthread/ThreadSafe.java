package com.test2.pthread;

public class ThreadSafe {
    public static void main(String[] argv){
        Account account = new Account("my", 10000);
        AccountThread accountThread = new AccountThread(account);
        AccountThread accountThread1 = new AccountThread(account);
        accountThread.start();
        accountThread1.start();
        /**
         * 异步的话输出：
         *      Thread-0 get 5000.0 res 5000.0
         *      Thread-1 get 5000.0 res 5000.0
         * 同步synchronized, 输出:
         *      Thread-0 get 5000.0 res 5000.0
         *      Thread-1 get 5000.0 res 0.0
         */
    }
}
class AccountThread extends Thread{
    private Account account;

    public AccountThread(Account account){
        this.account = account;
    }

    @Override
    public void run() {
        double money = 5000;
        account.withdraw(money);
        System.out.println(this.currentThread().getName() + " get " + money + " res " + account.getBalance());
    }
}