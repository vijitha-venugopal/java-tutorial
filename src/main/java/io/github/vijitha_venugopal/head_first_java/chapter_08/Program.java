package io.github.vijitha_venugopal.head_first_java.chapter_08;

/**
 * class for call amethod based on the refernce type,not the actual object type
 * Created by vijitha on 05/08/16.
 */
public class Program
{
    public static void main (String args []) {
        X obj1 = new X();
        X obj2 = new Y();
        obj1.methodA();
        obj2.methodA();
    }
}
class X
{
    public void methodA() //Base class method
    {
        System.out.println ("hello, I'm methodA of class X");
    }
}
class Y extends X
{
    public void methodA() //Derived Class method
    {
        System.out.println ("hello, I'm methodA of class Y");
    }
}