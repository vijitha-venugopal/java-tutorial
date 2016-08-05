package io.github.vijitha_venugopal.head_first_java.chapter_08;

import java.util.*;

/**
 * Created by vijitha on 05/08/16.
 */
public class InterfaceExampleTest {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.petname();
        obj.petcolor();

    }
}
interface Pet{
    void petname();
    void petcolor();
}
class Dog implements Pet {

    public void petname() {
        ArrayList<String> pets=new ArrayList<String>();
        pets.add("Rocky");
        pets.add("Jimmy");
        System.out.println("Dog contains :"+pets);
    }

    public void petcolor() {
        System.out.println("Color of pets are :Black");

    }

}