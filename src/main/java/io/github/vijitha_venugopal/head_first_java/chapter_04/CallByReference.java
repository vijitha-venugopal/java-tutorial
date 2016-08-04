package io.github.vijitha_venugopal.head_first_java.chapter_04;

/**
 * Created by vijitha on 04/08/16.
 */
public class CallByReference {
    public static void main ( String[] args ) {
        Number a = new Number();
        System.out.println("Value before calling increment() is "+a.x);
        increment(a);
        System.out.println("Value  after calling increment() is "+a.x);
    }

    public static void increment(Number n) {
        System.out.println("Value before incrementing is "+n.x);
        n.x=n.x+1;
        System.out.println("Value after incrementing is "+n.x);
    }
}

class Number {
    int x=4;
}




