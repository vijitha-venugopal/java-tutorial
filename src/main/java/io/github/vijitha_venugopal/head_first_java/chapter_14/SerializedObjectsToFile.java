package io.github.vijitha_venugopal.head_first_java.chapter_14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * class for writing a serialized object to file
 * Created by vijitha on 09/08/16.
 */
public class SerializedObjectsToFile {
    public static void main(String[] args) throws IOException {
        FileOutputStream file=new FileOutputStream("MyGame.ser");
        ObjectOutputStream os=new ObjectOutputStream(file);
        os.writeObject("characterOne");
        os.writeObject("characterTwo");
        os.writeObject("characterThree");
        os.close();
    }
}
