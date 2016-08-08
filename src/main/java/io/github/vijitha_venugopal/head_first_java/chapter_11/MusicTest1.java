package io.github.vijitha_venugopal.head_first_java.chapter_11;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import javax.sound.midi.*;
/**
 * class for testing Midi
 * Created by vijitha on 08/08/16.
 */
public class MusicTest1 {
    private void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer");
        } catch (MidiUnavailableException ex) {
            System.out.println("Bummer");
        }
    }

    public static void main(String[] args) {
        MusicTest1 mt=new MusicTest1();
        mt.play();
    }
}
