package io.github.vijitha_venugopal.head_first_java.chapter_02;

/**
 * class to test working of objects
 * Created by vijitha on 03/08/16.
 */
public class DrumkitTestDrive {
    public static void main(String[] args) {
        Drumkit d=new Drumkit();
        d.playSnare();
        d.snare=false;
        d.playTopHat();
        if(d.snare){
            d.playSnare();
        }
    }
}
class Drumkit {
    boolean topHat=true;
    boolean snare=true;

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
    void playSnare() {
        System.out.println("bang bang ba-bang");
    }
}



