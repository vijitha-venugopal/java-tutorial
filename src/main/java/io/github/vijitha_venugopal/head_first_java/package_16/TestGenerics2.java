package io.github.vijitha_venugopal.head_first_java.package_16;

import java.util.ArrayList;

/**
 * class for polymorphic arguments and generics
 * Created by vijitha on 13/08/16.
 */
public class TestGenerics2 {
    public static void main(String[] args) {
        new TestGenerics2().go();
    }

    public void go() {
        ArrayList<Animal1>animals=new ArrayList<Animal1>();
        animals.add(new Dog1());
        animals.add(new Cat1());
        animals.add(new Dog1());
        takeAnimals(animals);
    }

    public void takeAnimals(ArrayList<Animal1> animals) {
        for (Animal1 a: animals) {
            a.eat();
        }
    }
}
abstract class Animal1{
    void eat(){
        System.out.println("Animal eating");
    }
}
 class Dog1 extends Animal1{
    void bark(){

    }

}
class Cat1 extends Animal1{
    void meow(){

    }
}