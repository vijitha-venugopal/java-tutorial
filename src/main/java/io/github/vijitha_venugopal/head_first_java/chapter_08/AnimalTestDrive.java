package io.github.vijitha_venugopal.head_first_java.chapter_08;

/**
 * class using method in objects
 * Created by vijitha on 05/08/16.
 */


import java.util.ArrayList;

public class AnimalTestDrive {
    public static void main(String[] args) {
        ArrayList<String> pets = new ArrayList<String>();
        pets.add("Parrot");
        pets.add("Dog");
        pets.add("Cat");

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grape");

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Parrot");
        animals.add("Dog");
        animals.add("Cat");

        System.out.println("pets contain :" + pets);
        System.out.println("fruits contain :" + fruits);
        System.out.println("animals contain :" + animals);

        int thesize = pets.size();
        System.out.println("Size :" + thesize);
        boolean isin = pets.contains("Cat");
        System.out.println("Cat contains in pets :" + isin);
        int idx = pets.indexOf("Cat");
        System.out.println("Index of cat :" + idx);
        boolean empty = pets.isEmpty();
        System.out.println("Is it Pets empty ? :" + empty);


        AnimalTestDrive obj = new AnimalTestDrive();
        System.out.println("Class Name" + " ' " + obj.getClass() + " ' ");

        if (pets.equals(animals)) {
            System.out.println("Pets and animals are Equal  ");
        }
        else {
            System.out.println("Pets and animals are not Equal  ");
        }

        if (fruits.equals(animals)) {
            System.out.println("Fruits and animals are Equal  ");
        }
        else {
            System.out.println("Pets and animals are not Equal  ");
        }

        System.out.println("hashcode :" + " ' " + obj.hashCode() + " ' ");

        System.out.println("ToString :" + " ' " + obj.toString() + " ' ");
        System.out.println("What is the element in index 2 :" + " ' " +pets.get(2));

    }
}
