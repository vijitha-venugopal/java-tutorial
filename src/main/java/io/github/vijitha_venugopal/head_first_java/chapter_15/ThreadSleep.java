package io.github.vijitha_venugopal.head_first_java.chapter_15;

/**
 * class for thread sleep
 * Created by vijitha on 10/08/16.
 */

class MyRunnable1 implements Runnable {
    public void run(){
        go();
    }
    public void go() {
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        doMore();
    }

    private void doMore(){
        System.out.println("top o' the stack");
    }
}
class ThreadSleep{
    public static void main(String[] args) {
        Runnable threadJob= new MyRunnable1();
        Thread myThread=new Thread(threadJob);
        myThread.start();

        System.out.println("back in main");
    }
}
