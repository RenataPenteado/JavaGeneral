package j11.working.with.exceptions;

import java.io.*;
import javax.sound.midi.*;

public class MusicTest1 {

	public void play() {

		// Obtains the default Sequencer connected to a default device.
		Sequencer sequencer;
		try {
			sequencer = MidiSystem.getSequencer();

			// Opens the device, indicating that it should now acquire any
			// system resources it requires and become operational.
			sequencer.open();

			// create a stream from a file
			InputStream is = new BufferedInputStream(new FileInputStream(new File("src/chap11/midifile.mid")));

			// Sets the current sequence on which the sequencer operates.
			// The stream must point to MIDI file data.
			sequencer.setSequence(is);

			// Starts playback of the MIDI data in the currently loaded sequence.
			sequencer.start();

		} catch (MidiUnavailableException | InvalidMidiDataException | IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play();

	}

}
