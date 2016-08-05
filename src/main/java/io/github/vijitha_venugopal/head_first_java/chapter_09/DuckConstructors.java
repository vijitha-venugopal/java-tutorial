package io.github.vijitha_venugopal.head_first_java.chapter_09;

/**
 * class with constuctors
 * Created by vijitha on 05/08/16.
 */
public class DuckConstructors {
    public static void main(String[] args) {
        Ducks d=new Ducks(42);
        Ducks d1=new Ducks(42.25);

    }
}
class Ducks{
    private int size;
    Ducks(int duckSize) {
        System.out.println("Quack! Quack!");
        size=duckSize;
        System.out.println("Size :"+duckSize);

    }
    Ducks(Double duckSize) {
        Double size;
        System.out.println("Quack! Quack!");
        System.out.println("Size :"+duckSize);

    }

}
