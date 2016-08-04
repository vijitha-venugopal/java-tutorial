package io.github.vijitha_venugopal.head_first_java.chapter_07;

class Inheritance extends Parent {
    private void c1()
    {
        System.out.println("Child method");
        super.name = "Parent";
        System.out.println(super.name);
    }
    public static void main(String[] args)
    {
        Inheritance cobj = new Inheritance();
        cobj.c1();
        cobj.p1();
    }
}
class Parent
{
    String name;

    void p1()
    {
        System.out.println("Parent method");
    }
}