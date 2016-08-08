package io.github.vijitha_venugopal.head_first_java.chapter_10;

/**
 * class with static method
 * Created by vijitha on 05/08/16.
 */
public class StaticMethodTest {
    public static void main(String[] args) {
        display();  //calling without using object
        show();

        StaticMethodTest t = new StaticMethodTest();
        t.run();  //calling using object
    }

    private static void display() {

        System.out.println("Programming is amazing.");
    }
    private static void show(){
        System.out.println("Java is awesome.");
    }
    private void run(){
        System.out.println("Java is powerful.");
    }
}