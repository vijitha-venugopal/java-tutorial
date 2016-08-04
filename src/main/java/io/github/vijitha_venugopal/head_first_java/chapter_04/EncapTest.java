package io.github.vijitha_venugopal.head_first_java.chapter_04;

/**
 * class to test the working of encapsulation
 * Created by vijitha on 04/08/16.
 */
public class EncapTest{

    public static void main(String args[]){
        Encap encap = new Encap();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.println("Name : " + encap.getName());
        System.out.println(" Age : " + encap.getAge());
        System.out.println(" Id Number : " + encap.getIdNum());
    }
}
class Encap{

    private String name;
    private String idNum;
    private int age;

    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }

     String getIdNum(){
        return idNum;

    }

    void setAge( int newAge){
        age = newAge;
    }

     void setName(String newName){
        name = newName;
    }

    void setIdNum( String newId){
        idNum = newId;
    }
}
