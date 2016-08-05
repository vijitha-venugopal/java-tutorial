package io.github.vijitha_venugopal.head_first_java.chapter_09;

/**
 * class using inheritance and constructors
 * Created by vijitha on 05/08/16.
 */
public class ConstructorInheritanceDemo {
    public static void main(String[] args) {


        PermanentEmployee pObj = new PermanentEmployee();
    }
}
class Person
{
    Person()
    {
        System.out.println("Constructor of person class");
    }
}

class Employee extends Person
{
    Employee()
    {
        System.out.println("Constructor of employee class");
    }
}

class PermanentEmployee extends Employee
{
    PermanentEmployee()
    {
        System.out.println("Constructor of permanent employee class");
    }
}