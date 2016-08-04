package io.github.vijitha_venugopal.head_first_java.chapter_04;

/**
 * class to declaring & initializing instance variable
 * Created by vijitha on 04/08/16.
 */
public class PoorDogTestDrive {
    public static void main(String[] args) {
        PoorDog one=new PoorDog();
        System.out.println("Dog size is "+one.getSize());
        System.out.println("Dog Name is "+one.getName());
    }

}
class PoorDog {
    private int size;
    private String name;
    int getSize() {
        return size;
    }
    String getName() {
        return name;
    }

}