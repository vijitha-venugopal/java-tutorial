package io.github.vijitha_venugopal.head_first_java.package_16;

/**
 * Created by vijitha on 13/08/16.
 */
public class Song {
    String title;
    String artist;
    String rating;
    String bpm;

    Song(String t,String a,String r,String b) {
        title=t;
        artist=a;
        rating=r;
        bpm=b;

    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public String getRating(){
        return rating;
    }
    public String getBpm(){
        return bpm;
    }
    public String toString(){
        return  title;
    }
}
