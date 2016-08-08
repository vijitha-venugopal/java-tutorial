package io.github.vijitha_venugopal.head_first_java.chapter_10;

import java.util.ArrayList;

/**
 * class for an array list of primitive ints
 * Created by vijitha on 08/08/16.
 */
public class ArrayListOfPrimitives {
    public static void main(String[] args) {
        ArrayList listOfNumbers=new ArrayList();
        listOfNumbers.add(new Integer(3));
        listOfNumbers.add(new Integer(13));
        listOfNumbers.add(new Integer(43));
        Integer one=(Integer)listOfNumbers.get(1);
        int intOne=one.intValue();
//        listOfNumbers.add(3);
//        listOfNumbers.add(4);
//        listOfNumbers.add(1);
//        System.out.println(listOfNumbers.get(0));
    }
}
