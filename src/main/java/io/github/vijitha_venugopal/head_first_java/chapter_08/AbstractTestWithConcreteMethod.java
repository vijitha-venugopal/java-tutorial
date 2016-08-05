package io.github.vijitha_venugopal.head_first_java.chapter_08;

/**
 * class to test working of abstract class with concrete method
 * Created by vijitha on 05/08/16.
 */

class AbstractTestWithConcreteMethod {
    public static void main(String[] args)
    {
        B b=new B();
        b.callme();
        b.normal();
    }
}
abstract class A
{
    abstract void callme();
    public void normal()
    {
        System.out.println("this is concrete method");
    }
}
class B extends A {
    void callme() {
        System.out.println("this is callme.");
    }
}