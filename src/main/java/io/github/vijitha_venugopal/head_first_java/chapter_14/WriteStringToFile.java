package io.github.vijitha_venugopal.head_first_java.chapter_14;

import java.io.FileWriter;
import java.io.IOException;

/**
 * class for writing a string to a text file
 * Created by vijitha on 09/08/16.
 */
public class WriteStringToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("foo.txt");
            writer.write("hello foo!..");
            System.out.println("Writed in foo.txt");
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
