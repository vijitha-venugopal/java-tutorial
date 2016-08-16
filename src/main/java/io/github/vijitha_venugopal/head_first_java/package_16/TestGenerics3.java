package io.github.vijitha_venugopal.head_first_java.package_16;

import java.util.ArrayList;

/**
 * Created by vijitha on 13/08/16.
 */
public class TestGenerics3 {
    public static void main(String[] args) {
        new TestGenerics3().go();
    }

    public void go() {
        Dog2[] dogs={new Dog2(), new Dog2(),new Dog2()};
        takeAnimals(dogs);


    }

    public void takeAnimals(Dog2[] animals) {
        for(Animal2 a: animals) {
            a.eat();
        }
            }

}
abstract class Animal2{
    void eat(){
        System.out.println("Animal eating");
    }
}
class Dog2 extends Animal2{
    void bark(){

    }

}
class Cat2 extends Animal2{
    void meow(){

    }
}