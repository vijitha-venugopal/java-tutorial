package io.github.vijitha_venugopal.head_first_java.chapter_14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by vijitha on 09/08/16.
 */
public class FileClass {
    public static void main(String[] args) throws IOException {
        File dir=new File("Chapter14");
        dir.mkdir();
        File file=new File("Chapter14/test.txt");
        File file1=new File("Chapter14/Test.txt");
        FileWriter writer = new FileWriter(file);
        FileWriter writer1 = new FileWriter(file1);
        writer.append("Hello World\nHow are you?");
        writer1.append("Hello World\nHow are you?");
        writer.close();
        writer1.close();

        if (dir.isDirectory()){
            String[] dirContents=dir.list();
            for (int i=0;i<dirContents.length;i++) {
                System.out.println("Directory Contents :"+dirContents[i]);
            }
                System.out.println("Absolute directory path :"+dir.getAbsolutePath());
            }
            boolean isDeleted=file1.delete();
        }
    }

