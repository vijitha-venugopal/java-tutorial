package io.github.vijitha_venugopal.head_first_java.chapter_02;

/**
 * class to test working of object
 * Created by vijitha on 03/08/16.
 */

public class TapDeskTestDrive {
    public static void main(String[] args) {
        TapeDeck t=new TapeDeck();
        t.pauseTape();
        t.canRecord=true;
        t.playTape();
        if(t.canRecord) {
            t.recordTape();
        }

    }
}
class TapeDeck {
    boolean canRecord=false;

    void playTape() {
        System.out.println("Tape Playing");
    }
    void recordTape() {
        System.out.println("Tape Recording");
    }
    void pauseTape() {
        System.out.println("Tape Pausing");
    }
}