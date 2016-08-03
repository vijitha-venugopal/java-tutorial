package io.github.vijitha_venugopal.head_first_java.chapter_02;

/**
 * Created by vijitha on 03/08/16.
 */
public class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d=new DVDPlayer();
        d.canRecord=true;
        d.playDVD();
        if(d.canRecord==true){
            d.recordDVD();
        }
    }
}

class DVDPlayer {
    boolean canRecord=false;

    void recordDVD() {
        System.out.println("DVD recorded");
    }
    void playDVD() {
        System.out.println("Play DVD ");
    }
}
