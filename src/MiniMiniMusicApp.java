/**
 * @author xh
 * @date 2022/4/10
 * @apiNote
 */
import javax.sound.midi.*;
public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }
    public void play(){
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144,3,77,100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage c = new ShortMessage();
            c.setMessage(128,3,77,100);
            MidiEvent noteOn1 = new MidiEvent(a, 16);
            track.add(noteOn1);

            ShortMessage b = new ShortMessage();
            b.setMessage(128,3,47,100);
            MidiEvent noteOff = new MidiEvent(a, 16);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
