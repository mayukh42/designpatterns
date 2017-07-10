package oop.model.product.pc;

/**
 * Created by mayukh42 on 29/5/17.
 */
public class Bios {

    void post() {
        System.out.println("Power on Self Test conducted");
    }

    void flash(String data) {
        System.out.println("BIOS flashed with " + data);
    }
}
