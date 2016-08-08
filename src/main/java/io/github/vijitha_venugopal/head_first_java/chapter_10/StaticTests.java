package io.github.vijitha_venugopal.head_first_java.chapter_10;

/**
 * class using static variables
 * Created by vijitha on 08/08/16.
 */
public class StaticTests extends Staticsuper {
    private static int rand;
    static {
        rand=(int)(Math.random()*6);
        System.out.println("Static block "+rand);
    }
    private StaticTests() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("in main");
        StaticTests st=new StaticTests();
    }
}
class Staticsuper {
    static {
        System.out.println("super static block");
    }
    Staticsuper(){
        System.out.println("super constructor");
    }
}
