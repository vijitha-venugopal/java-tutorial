package io.github.vijitha_venugopal.head_first_java.chapter_14;

import java.io.Serializable;

public class DungeonGame implements Serializable {

    public int x=3;
    public transient long y=4;
    private short z=5;
    int getX() {
        return x;
    }
    long getY(){
        return y;
    }
    short getZ(){
        return z;
    }

}
