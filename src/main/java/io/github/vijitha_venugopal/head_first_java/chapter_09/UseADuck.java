package io.github.vijitha_venugopal.head_first_java.chapter_09;

/**
 * class using constuctor
 * Created by vijitha on 05/08/16.
 */
public class UseADuck {
    public static void main(String[] args) {
        Duck d=new Duck(42);
    }
}
class Duck{
    int size;
    public Duck(int duckSize) {
        System.out.println("Quack! Quack!");
        size=duckSize;
        System.out.println("Size :"+duckSize);

    }

}