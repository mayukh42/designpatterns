package oop.patterns.gof;

import oop.model.product.pc.*;

/**
 * Created by mayukh42 on 29/5/17.
 *
 * The Facade design pattern
 *  Simple API for complex components
 */
public class Facade {

    public static void operateComputer() {
        Computer pc = new Computer(new HardDrive(), new Bios(), new Keyboard(), new RAM());
        pc.powerOn();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pc.powerOff();
    }
}
