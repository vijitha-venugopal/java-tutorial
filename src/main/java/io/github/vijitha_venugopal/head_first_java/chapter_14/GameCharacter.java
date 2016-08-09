package io.github.vijitha_venugopal.head_first_java.chapter_14;

import java.io.Serializable;

/**
 * class for Game characters
 * Created by vijitha on 09/08/16.
 */
public class GameCharacter implements Serializable{
    int power;
    String type;
    String[] weapons;

    public GameCharacter(int p,String t,String[] w){
        power=p;
        type=t;
        weapons=w;
    }
    public int getPower(){
        return power;
    }
    public String getType(){
        return type;
    }
    public String getWeapons() {
        String weaponList="";
        for (int i=0;i<weapons.length;i++) {
            weaponList +=weapons[i] +" ";
        }
        return weaponList;
    }
}
