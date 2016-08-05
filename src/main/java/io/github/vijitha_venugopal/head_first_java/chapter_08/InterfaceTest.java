package io.github.vijitha_venugopal.head_first_java.chapter_08;

/**
 * Created by vijitha on 05/08/16.
 */
public class InterfaceTest {
    public static void main(String args[]){
        Interface obj = new Interface();
        obj.print();
        obj.show();
    }
}

interface Printable{
    void print();
}

interface Showable{
    void show();
}

class Interface implements Printable,Showable {

    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }

}