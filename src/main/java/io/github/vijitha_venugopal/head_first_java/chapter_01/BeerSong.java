package io.github.vijitha_venugopal.head_first_java.chapter_0;

/**
 * Created by vijitha on 03/08/16.
 */
public class BeerSong {
    public static void main(String[] args) {
        int beerNum=2;
        String word="bottles";
        while(beerNum>0) {
            if(beerNum==1) {
                word="bottle";
            }
            System.out.println(beerNum+" "+word+" of beer on the wall ");
            System.out.println(beerNum+" "+word+" of beer . ");
            System.out.println(" Take one down. ");
            System.out.println(" Pass it around. ");
            beerNum=beerNum-1;
            if (beerNum>0) {
                System.out.println(beerNum+" "+word+" of beer on the wall ");
            }
            else {
                System.out.println(beerNum+" "+word+" no more bottles of beer on the wall ");
            }
        }
    }
}
