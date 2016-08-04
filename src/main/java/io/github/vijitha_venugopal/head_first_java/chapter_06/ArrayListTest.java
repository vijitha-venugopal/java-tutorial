package io.github.vijitha_venugopal.head_first_java.chapter_06;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> pets=new ArrayList<String>();
        pets.add("Parrot");
        pets.add("Dog");
        pets.add("Cat");
        int thesize=pets.size();
        System.out.println("Size :"+thesize);
        boolean isin=pets.contains("Cat");
        System.out.println("Cat contains in pets :"+isin);
        int idx=pets.indexOf("Cat");
        System.out.println("Index of cat :"+idx);
        boolean empty=pets.isEmpty();
        System.out.println("Is it Pets empty ? :"+empty);
        pets.remove("Cat");
        System.out.println("Pets contains :"+pets);
    }
}
