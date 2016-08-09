package io.github.vijitha_venugopal.head_first_java.chapter_14;

import java.io.Serializable;

/**
 * class for serialization
 * Created by vijitha on 09/08/16.
 */
public class Employee implements Serializable
{
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}
