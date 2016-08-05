package io.github.vijitha_venugopal.head_first_java.chapter_08;

/**
 * class for test the working of inner object
 * Created by vijitha on 05/08/16.
 */
public class TestMe {

    public static void main( String args[] )
    {

        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.doStuff();
    }
}
class Outer
{
    private int size ;
    private String thoughts = "My outer thoughts";

    class Inner
    {
        String innerThoughts = "My inner thoughts";

        void doStuff()
        {
            System.out.println( innerThoughts );
            System.out.println(thoughts);
        }
    }
}