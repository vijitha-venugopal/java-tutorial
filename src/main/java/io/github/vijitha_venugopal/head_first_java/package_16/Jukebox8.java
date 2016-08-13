package io.github.vijitha_venugopal.head_first_java.package_16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

/**
 * class using treeset
 * Created by vijitha on 13/08/16.
 */
public class Jukebox8 {

    ArrayList<Song> songLst = new ArrayList<Song>();
    public static void main(String[] args) {
        new Jukebox8().go();

    }


    public void go() {
        getSongs();
        System.out.println(songLst);
        Collections.sort(songLst);
        System.out.println(songLst);
        TreeSet<Song> songSet = new TreeSet<Song>();
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