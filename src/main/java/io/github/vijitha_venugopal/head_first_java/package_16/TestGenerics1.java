package io.github.vijitha_venugopal.head_first_java.package_16;

/**
 * Created by vijitha on 13/08/16.
 */
public class TestGenerics1 {
    public static void main(String[] args) {
        new TestGenerics1().go();
    }

    public void go() {
        Animal[] animals = {new Dog(), new Cat(), new Dog()};
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        takeAnimals(animals);
        takeAnimals(dogs);
    }

    public void takeAnimals(Animal[] animals) {
        for (Animal a: animals) {
            a.eat();
        }
    }
}
abstract class Animal{
    void eat(){
        System.out.println("Animal eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barking");

    }

}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat meow");

    }
}