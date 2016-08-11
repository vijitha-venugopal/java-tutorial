package io.github.vijitha_venugopal.head_first_java.chapter_15;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * class using syncronized
 * Created by vijitha on 11/08/16.
 */

class TestSyncTest{
    public static void main(String[] args) {
        TestSync job=new TestSync();
        Thread a=new Thread(job);
        Thread b=new Thread(job);
        a.start();
        b.start();
    }
}
class TestSync implements Runnable{

    private int balance;
    public  void  run() {
        for (int i=0;i<5;i++){
            increment();
            System.out.println(" Balance is "+balance);
        }
    }

    private synchronized void increment() {
        int i=balance;
        balance=i+1;
    }
}