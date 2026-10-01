package chapter3;

import javax.sound.midi.MidiFileFormat;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);
        if (b) System.out.println("Этoт код выполняется.");
        b = false;
        if (b) System.out.println("Этoт код не выполняется.");
    }
}
