package io.github.vijitha_venugopal.head_first_java.chapter_02;

/**
 * Created by vijitha on 03/08/16.
 */
public class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Ruff!  Ruff!");
    }
}
class DogTestDrive {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
    }
}
