package io.github.vijitha_venugopal.head_first_java.chapter_15;

import java.lang.Runnable;
/**
 * class using thread
 * Created by vijitha on 10/08/16.
 */
public class ThreadTester{
    public static void main(String[] args) {
        Runnable threadJob= new MyRunnable();
        Thread myThread=new Thread(threadJob);
        myThread.start();

        System.out.println("back in main");
    }
}
class MyRunnable implements Runnable {
    public void run(){
        go();
    }
    public void go() {
        System.out.println("go method");
        more();
    }
    private void more(){
        System.out.println("more method");
        doMore();
    }
    private void doMore(){
        System.out.println("doMore method");
    }
}