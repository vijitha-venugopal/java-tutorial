package io.github.vijitha_venugopal.head_first_java.chapter_07;

/**
 * Created by vijitha on 05/08/16.
 */
public class Mixed {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        a.m1();;
        b.m1();
        c.m1();
    }

}
class A {
    int ivar=7;
    void m1() {
        System.out.print("A's m1, ");
    }
    void m2() {
        System.out.print("A's m2, ");
    }
    void m3() {
        System.out.print("A's m3, ");
    }
}
class B extends A {
    void m1() {
        System.out.print("B's m1, ");
    }
}
class C extends B {
    void m3() {
        System.out.print("C's m3, "+(ivar+6));
    }

}