package io.github.vijitha_venugopal.head_first_java.chapter_10;

/**
 * class for wrapping a primitive
 * Created by vijitha on 08/08/16.
 */
public class WrappingPrimitiveTest {
    public static void main(String[] args) {
        int i=288;
        Integer iWrap= i;
        int unwrapped= iWrap;
        System.out.println(i);
        System.out.println(iWrap);
        System.out.println(unwrapped);

    }
}


