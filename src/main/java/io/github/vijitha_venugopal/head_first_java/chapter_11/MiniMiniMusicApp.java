package io.github.vijitha_venugopal.head_first_java.chapter_11;

import javax.sound.midi.*;

/**
 * class Using Midi package and Exception
 * Created by vijitha on 08/08/16.
 */
public class MiniMiniMusicApp {

    public static void main(String[] args) {
        MiniMiniMusicApp mini=new MiniMiniMusicApp();
        mini.play();
    }
    private void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq=new Sequence(Sequence.PPQ,4);
            Track track=seq.createTrack();

            ShortMessage a=new ShortMessage();
            a.setMessage(144,1,50,100);
            MidiEvent noteOn=new MidiEvent(a,1);
            track.add(noteOn);

            ShortMessage b=new ShortMessage();
            b.setMessage(128,1,127,100);
            MidiEvent noteOff=new MidiEvent(b,16);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
