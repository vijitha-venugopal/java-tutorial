package io.github.vijitha_venugopal.head_first_java.chapter_14;

import java.io.*;

/**
 * Created by vijitha on 09/08/16.
 */
public class GameSaverTest {
    public static void main(String[] args) {
        GameCharacter one=new GameCharacter(50, "EIF",new String[]{"bow,"," sword,"," dust"});
        GameCharacter two=new GameCharacter(200, "Troll",new String[]{"bare hands,","big ax,"," xyz"});
        GameCharacter three=new GameCharacter(120, "Magician",new String[]{"spells,"," invisibility"});

        try {
            ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
//        one=null;
//        two=null;
//        three=null;

        try {
            ObjectInputStream is=new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore=(GameCharacter) is.readObject();
            GameCharacter twoRestore=(GameCharacter) is.readObject();
            GameCharacter threeRestore=(GameCharacter) is.readObject();

            System.out.println("One's type: "+oneRestore.getWeapons());
            System.out.println("Two's type: "+twoRestore.getWeapons());
            System.out.println("Three's type: "+threeRestore.getWeapons());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
