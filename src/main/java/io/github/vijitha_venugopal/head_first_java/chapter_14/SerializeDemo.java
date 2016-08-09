package io.github.vijitha_venugopal.head_first_java.chapter_14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * class for serialization
 * Created by vijitha on 09/08/16.
 */
public class SerializeDemo
{
    public static void main(String [] args)
    {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;

        try
        {
            FileOutputStream fileOut =new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in employee.ser");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }
}
class Employee implements Serializable
{
    public String name;
    String address;
    transient int SSN;
    int number;


}