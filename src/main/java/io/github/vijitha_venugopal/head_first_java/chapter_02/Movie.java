package io.github.vijitha_venugopal.head_first_java.chapter_02;

/**
 * Created by vijitha on 03/08/16.
 */
public class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the movie");
    }
}
class MovieTestDrive {
    public static void main(String[] args) {
        Movie one=new Movie();
        one.title="Gone with the stock";
        one.genre="Tragic";
        one.rating=-2;

        Movie two=new Movie();
        two.title="Lost in cubicle space";
        two.genre="Commedy";
        two.rating=5;
        two.playIt();

        Movie three=new Movie();
        three.title="Byte club";
        three.genre="Tragic but ultimately uplifting";
        three.rating=127;
    }

}
