package io.github.vijitha_venugopal.head_first_java.chapter_15;
import java.lang.Runnable;
/**
 * class for multiple threads
 * Created by vijitha on 11/08/16.
 */


class MultipleThreads implements Runnable{
    public static void main(String[] args) {
        MultipleThreads runner=new MultipleThreads();
        Thread alpha=new Thread(runner);
        Thread beta=new Thread(runner);
        alpha.setName("Alpha thread");
        beta.setName("Beta thread");
        alpha.start();
        beta.start();
    }

    public void run() {
        for (int i=0;i<5;i++){
            String threadName=Thread.currentThread().getName();
            System.out.println(threadName+" is running");
        }
    }
}