package io.github.vijitha_venugopal.head_first_java.chapter_04;

/**
 * class to learn how work call by value
 * Created by vijitha on 04/08/16.
 */
public class XCopy {
    public static void main(String[] args) {
        int orig=45;
        XCopy a=new XCopy();
        int y=a.go(orig);
        System.out.println(orig+" " + y);
    }

    private int go(int arg) {
        arg=arg*2;
        return arg;
    }
}
