package io.github.vijitha_venugopal.head_first_java.chapter_14;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * class for serializing a class
 * Created by vijitha on 09/08/16.
 */
public class Box implements Serializable{
    private int width;
    private int height;

    private void setWidth(int w){
        width=w;
    }

    private void setHeight(int h){
        height=h;
    }

    public static void main(String[] args) {
        Box mybox=new Box();
        mybox.setWidth(50);
        mybox.setHeight(20);

        try{
            FileOutputStream fs=new FileOutputStream("foo.ser");
            ObjectOutputStream os=new ObjectOutputStream(fs);
            os.writeObject(mybox);

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
