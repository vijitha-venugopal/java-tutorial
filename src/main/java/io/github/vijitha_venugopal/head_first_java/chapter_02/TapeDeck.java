package io.github.vijitha_venugopal.head_first_java.chapter_02;

/**
 * Created by vijitha on 03/08/16.
 */
public class TapeDeck {
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
class TapDeskTestDrive {
    public static void main(String[] args) {
        TapeDeck t=new TapeDeck();
        t.pauseTape();
        t.canRecord=true;
        t.playTape();
        if(t.canRecord==true) {
            t.recordTape();
        }

    }
}