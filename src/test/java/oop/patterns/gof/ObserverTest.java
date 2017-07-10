package oop.patterns.gof;

import oop.patterns.gof.Observer;

/**
 * Created by mayukh42 on 3/6/17.
 *
 * A public static void main() method is required for the correct console to appear, otherwise running using the
 * default JUnit Test configuration will only result in a console that doesn't receive inputs
 */
public class ObserverTest {

    public static void main(String[] args) {
        writeInTwoFormats();
    }

    private static void writeInTwoFormats() {
        Observer observer = new Observer();
        new Thread(observer).start();
    }
}
