package io.github.vijitha_venugopal.head_first_java.chapter_14;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * class using serialization
 * Created by vijitha on 09/08/16.
 */
public class Pond extends Duck  {
    private Duck duck=new Duck();

    public static void main(String[] args) {
        Duck myDuck= new Duck();
        myDuck.setName("Donald");
        try{
            FileOutputStream fs=new FileOutputStream("ponf.ser");
            ObjectOutputStream os=new ObjectOutputStream(fs);

            os.writeObject(myDuck);
            os.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
class Duck implements Serializable{
    private String name;

    void setName(String n){
        name=n;
    }

}