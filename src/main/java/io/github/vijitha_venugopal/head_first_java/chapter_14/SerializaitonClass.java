package io.github.vijitha_venugopal.head_first_java.chapter_14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * class for versionod control
 * Created by vijitha on 10/08/16.
 */
public class SerializaitonClass {

    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.firstName = "Vivekanand";
        emp.lastName = "Gautam";
        emp.address="mnbvcdcx";

        try {
            FileOutputStream fileOut = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in employee.txt file");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
