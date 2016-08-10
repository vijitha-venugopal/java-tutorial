package io.github.vijitha_venugopal.head_first_java.chapter_14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * class using bufferedwriter
 * Created by vijitha on 10/08/16.
 */
public class BufferTest {
    public static void main(String[] args) throws IOException {
        File aFile=new File("MyCode");
        BufferedWriter writer=new BufferedWriter(new FileWriter(aFile));
        writer.append("Good Morning\nHave a nice day");
        writer.close();
    }
}
