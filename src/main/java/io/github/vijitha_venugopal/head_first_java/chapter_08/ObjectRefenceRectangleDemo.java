package io.github.vijitha_venugopal.head_first_java.chapter_08;

/**
 * class using object reference
 * Created by vijitha on 05/08/16.
 */
class ObjectRefenceRectangleDemo {
    public static void main(String args[]) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = r1;

        r1.length = 10;
        r2.length = 20;

        System.out.println("Value of R1's Length : " + r1.length);
        System.out.println("Value of R2's Length : " + r2.length);

    }
}
class Rectangle {
    double length;
    double breadth;
}