package io.github.vijitha_venugopal.head_first_java.chapter_08;

/**
 * class for abstract class implementation
 * Created by vijitha on 05/08/16.
 */
public class AbstractMethodImplement {
    public static void main(String[] args) {
        ClassB b=new ClassB();
        b.methodA();
        b.methodB();
        b.methodTOpclass();

    }
}
abstract class TopClass {
    public abstract void methodA();
    public abstract void methodB();
    public void methodTOpclass() {
        System.out.println("Implement MethodTopclass");
    }
}

abstract class ClassA extends TopClass {
//    @Override
    public void methodA() {
        System.out.println("Implement Method A");
    }
}

class ClassB extends ClassA {
//    @Override
    public void methodB() {
        System.out.println("Implement Method B");
    }
}