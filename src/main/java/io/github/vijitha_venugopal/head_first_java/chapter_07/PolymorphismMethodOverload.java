package io.github.vijitha_venugopal.head_first_java.chapter_07;

/**
 *
 * class to test working of method overloading
 * Created by vijitha on 04/08/16.
 */
public class PolymorphismMethodOverload {
    public static void main(String[] args) {
        Overload Obj = new Overload();
        double result;
        Obj .demo(10);
        Obj .demo(10, 20);
        result = Obj .demo(5.5);
        System.out.println("O/P : " + result);

    }

}
class Overload
{
    void demo (int a)
    {
        System.out.println ("a: " + a);
    }
    void demo (int a, int b)
    {
        System.out.println ("a and b: " + a + "," + b);
    }
    double demo(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}