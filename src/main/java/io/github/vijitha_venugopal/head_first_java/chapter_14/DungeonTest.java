package io.github.vijitha_venugopal.head_first_java.chapter_14;

import java.io.*;

/**
 * class DungeonTest
 * Created by vijitha on 10/08/16.
 */
public class DungeonTest {
    public static void main(String[] args) {
        DungeonGame d=new DungeonGame();
        System.out.println("X: " + d.getX());
        System.out.println("Y: " + d.getY());
        System.out.println("Z: " + d.getZ());
        System.out.println("X+Y+Z : " +(d.getX()+d.getY()+ d.getZ())+"\n");

        try {
            FileOutputStream fos=new FileOutputStream("dg.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(d);
            oos.close();
            fos.close();
            System.out.printf("Serialized data is saved in dg.ser\n");

            FileInputStream fis=new FileInputStream("dg.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            d=(DungeonGame) ois.readObject();
            ois.close();
            fis.close();
            System.out.println("Deserialized Dg.ser...");
            System.out.println("X: " + d.getX());
            System.out.println("Y: " + d.getY());
            System.out.println("Z: " + d.getZ());
            System.out.println("X+Y+Z : " +(d.getX()+d.getY()+ d.getZ()));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
