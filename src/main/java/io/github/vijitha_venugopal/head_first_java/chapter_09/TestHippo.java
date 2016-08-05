package io.github.vijitha_venugopal.head_first_java.chapter_09;

/**
 * class using constructors
 * Created by vijitha on 05/08/16.
 */
public class TestHippo {
    public static void main(String[] args) {
        System.out.println("Starting");
        Hippo h=new Hippo();
    }
}
class Animal{
    public Animal(){
        System.out.println("Making an animal");
    }
}
class Hippo extends Animal {
    public Hippo(){
        System.out.println("Making a Hippo");
    }
}