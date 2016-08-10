package io.github.vijitha_venugopal.head_first_java.chapter_14;

import java.io.Serializable;

/**
 * class for version id controll
 * Created by vijitha on 10/08/16.
 */
public class Employee1 implements Serializable
{
    public String firstName;
    public String lastName;
    public String address;
    private static final long serialVersionUID = 5462223600L;
}
