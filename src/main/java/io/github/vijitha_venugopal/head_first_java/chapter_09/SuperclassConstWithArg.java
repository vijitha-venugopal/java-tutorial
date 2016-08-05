package io.github.vijitha_venugopal.head_first_java.chapter_09;

/**
 * class using super class constructors with arguments
 * Created by vijitha on 05/08/16.
 */
public class SuperclassConstWithArg {
    public static void main(String[] args) {
        Hippo1 h=new Hippo1("Buffy");
        System.out.println(h.getName());
    }
}
class Animals{
    private String name;
    public String getName(){
        return name;
    }
    Animals(String theName){
        name=theName;
    }
}
class Hippo1 extends Animals {
    Hippo1(String name){
        super(name);
    }
}