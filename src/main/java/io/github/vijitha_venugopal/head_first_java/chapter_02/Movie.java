package io.github.vijitha_venugopal.head_first_java.chapter_02;

/**
 * Created by vijitha on 03/08/16.
 */
public class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playting the movie");
    }
}
class MovieTestDrive {
    public static void main(String[] args) {
        Movie one=new Movie();
        one.playIt();

        Movie two=new Movie();

    }
}
