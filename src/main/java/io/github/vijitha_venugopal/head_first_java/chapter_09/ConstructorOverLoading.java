package io.github.vijitha_venugopal.head_first_java.chapter_09;

/**
 * class for consructor overloading
 * Created by vijitha on 05/08/16.
 */

public class ConstructorOverLoading {
    public static void main(String[] args) {

        COverloading mco = new COverloading();
        COverloading spmco = new COverloading(10);
        COverloading dpmco = new COverloading(10,20);
        COverloading dpmco1 = new COverloading("java2novice");
    }
}
class COverloading {
    COverloading() {
        System.out.println("Inside default constructor");
    }

    COverloading(int i) {
        System.out.println("Inside single parameter constructor with int value");
    }

    COverloading(String str) {
        System.out.println("Inside single parameter constructor with String object");
    }

    COverloading(int i, int j) {
        System.out.println("Inside double parameter constructor");
    }
}