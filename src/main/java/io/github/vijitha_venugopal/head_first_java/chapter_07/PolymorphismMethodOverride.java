package io.github.vijitha_venugopal.head_first_java.chapter_07;

/**
 * Created by vijitha on 04/08/16.
 */
public class PolymorphismMethodOverride {
    public static void main(String[] args) {
        BaseClass obj1 = new DerivedClass();
        obj1.methodToOverride();

    }
}
class BaseClass
{
    public void methodToOverride()
    {
        System.out.println ("I'm the method of BaseClass");
    }
}
class DerivedClass extends BaseClass
{
    public void methodToOverride()
    {
        super.methodToOverride();
        System.out.println ("I'm the method of DerivedClass");
    }
}