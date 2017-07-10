package oop.model.product.pc;

/**
 * Created by mayukh42 on 29/5/17.
 *
 * Facade for a complex device
 */
public class Computer {

    private HardDrive hdd;
    private Bios bios;
    private Keyboard keyboard;
    private RAM ram;

    public Computer(HardDrive hdd, Bios bios, Keyboard keyboard, RAM ram) {
        this.hdd = hdd;
        this.bios = bios;
        this.keyboard = keyboard;
        this.ram = ram;
    }

    public void powerOn() {
        bios.post();
        ram.start();
        keyboard.push("F2");
        hdd.seek(0);
        System.out.println("Computer started. Waiting for commands...");
    }

    public void powerOff() {
        System.out.println("Sending all processes the TERM signal.");
        hdd.stop();
    }
}
