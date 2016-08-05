package io.github.vijitha_venugopal.head_first_java.chapter_10;

/**
 * Created by vijitha on 05/08/16.
 */
public class StaticClassTest {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
    }
}

class Example1{
    //Static class
    public static class Wheel {
        public Wheel() {
            System.out.println("Wheel created!");
        }
    }

    public Example1() {
        System.out.println("Car Parts object created!");
    }
}