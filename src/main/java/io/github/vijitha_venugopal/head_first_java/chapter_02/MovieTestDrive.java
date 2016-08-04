package io.github.vijitha_venugopal.head_first_java.chapter_02;

/**
 * claas to test working of object
 * Created by vijitha on 03/08/16.
 */
public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one=new Movie();
        one.playIt();

        Movie two=new Movie();

    }
}
class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playting the movie");
    }
}

