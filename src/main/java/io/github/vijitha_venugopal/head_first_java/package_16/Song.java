package io.github.vijitha_venugopal.head_first_java.package_16;

import java.util.Locale;

/**
 * using generic class
 * Created by vijitha on 13/08/16.
 */
class Song implements Comparable<Song>{
    String title;
    String artist;
    String rating;
    String bpm;


    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }

    Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }



    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    public String toString() {
        return title;
    }

}
