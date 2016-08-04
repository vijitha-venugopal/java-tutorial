package io.github.vijitha_venugopal.head_first_java.chapter_07;

class Inheritance extends Parent {
    private String name;

    public Inheritance(String name) {
        super(name);
        this.name = name;
    }

    private void c1()
    {
        System.out.println("Child method");
        System.out.println(super.getName());
        super.setName("Parent");
        System.out.println(super.getName());
    }
    public static void main(String[] args)
    {
        Inheritance inheritance = new Inheritance("Inheritance");
        inheritance.c1();
        inheritance.p1();
        OtherChild otherChild = new OtherChild("Other Child");
        otherChild.c1();
        otherChild.p1();
    }
}
class OtherChild extends Parent{
    private String name;
    public OtherChild(String name) {
        super(name);
        this.name = name;
    }
    public void c1()
    {
        System.out.println("Other Child method");
        System.out.println(super.getName());
        super.setName("Parent");
        System.out.println(super.getName());
    }
}
class Parent
{
    private String name;

    public Parent(String name) {
        this.name = name;
    }

    void p1()
    {
        System.out.println("Parent method");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return "From Parent " + name;
    }
}