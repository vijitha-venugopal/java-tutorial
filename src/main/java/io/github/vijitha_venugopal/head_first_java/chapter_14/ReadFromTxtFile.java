package io.github.vijitha_venugopal.head_first_java.chapter_14;

import java.io.*;

/**
 * class for reading from a text file
 * Created by vijitha on 10/08/16.
 */
public class ReadFromTxtFile {
    public static void main(String[] args) {
        try {
            File myFile=new File("MyText.txt");
            FileWriter writer=new FileWriter(myFile);
            writer.append("Good Morning \n Have a nice day");
            writer.close();
//            FileReader fileReader=new FileReader(myFile);
            BufferedReader reader=new BufferedReader(new FileReader(myFile));
//            BufferedReader reader=new BufferedReader(fileReader);

            String line;
            while ((line=reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
