package io.github.vijitha_venugopal.head_first_java.chapter_15;

/**
 * class using multiple threads
 * Created by vijitha on 11/08/16.
 */

public class RyanAndMonicaJob implements Runnable {
    private BankAccount account=new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob thejob=new RyanAndMonicaJob();
        Thread one=new Thread(thejob);
        Thread two=new Thread(thejob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }
    public void run() {
        for (int x=0;x<3;x++){
            makeWithdrawl(40);
            if(account.getBalance()<0){
                System.out.println(" Overdrawn");
            }
        }
    }

    private void makeWithdrawl(int amount) {
        if(account.getBalance()>=amount){
            System.out.println(Thread.currentThread().getName()+" is about to withdraw");
            try {
                System.out.println(Thread.currentThread().getName()+" is going to sleep");
                Thread.sleep(500);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" woke up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName()+" completes the withdrawl");
        }
        else {
            System.out.println("Sorry,not enough for "+Thread.currentThread().getName());
        }
    }
}
class BankAccount {
    private int balance=100;
    int getBalance(){
        return balance;
    }
    void withdraw(int amount){
        balance=balance-amount;
    }
}
