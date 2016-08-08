package io.github.vijitha_venugopal.head_first_java.chapter_10;

/**
 * class for initializing a ststic variable
 * Created by vijitha on 08/08/16.
 */
public class PlayerTestDrive {
    public static void main(String[] args) {
        System.out.println(player.playerCount);
        player one=new player("Tiger Woods") ;
        player two=new player("Tiger Woods1") ;
        System.out.println(player.playerCount);
    }
}
class player{
    static int playerCount;
    private String name;
    player(String n){
        name=n;
        playerCount++;
    }
}