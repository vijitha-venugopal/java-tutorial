package io.github.vijitha_venugopal.head_first_java.chapter_03;

/**
 * class to test working of array
 * Created by vijitha on 03/08/16.
 */
public class Dog {
    private String name;

    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.bark();
        dog1.name="Bart";

        Dog[] myDogs=new Dog[3];
        myDogs[0]=new Dog();
        myDogs[1]=new Dog();
        myDogs[2]=dog1;

        myDogs[0].name="Fred";
        myDogs[1].name="Marge";

        System.out.print("last dog's name is ");
        System.out.println(myDogs[2].name);
        int x=0;
        while (x<myDogs.length) {
            myDogs[x].bark();
            x=x+1;
        }
    }

    private void bark() {
        System.out.println(name+" says Ruff!");

    }

}
