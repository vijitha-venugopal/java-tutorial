package io.github.vijitha_venugopal.head_first_java.package_16;

import java.util.*;
import java.io.*;
/**
 * class using hashmap
 * Created by vijitha on 13/08/16.
 */
public class Jukebox6 {


    ArrayList<Song> songLst = new ArrayList<Song>();
    public static void main(String[] args) {
        new Jukebox5().go();

    }

    class ArtistCompare implements Comparator<Song> {
        public int compare(Song one, Song two) {
            return one.getArtist().compareTo(two.getArtist());
        }
    }

    public void go() {
        getSongs();
        System.out.println(songLst);
        Collections.sort(songLst);
        System.out.println(songLst);
        HashSet<Song> songSet = new HashSet<Song>();
        songSet.addAll(songLst);
        System.out.println(songSet);


    }

    void getSongs() {
        try {
            File file = new File("SongLst.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songLst.add(nextSong);
    }
}