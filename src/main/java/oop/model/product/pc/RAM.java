package oop.model.product.pc;

/**
 * Created by mayukh42 on 29/5/17.
 */
public class RAM {

    void start() {
        System.out.println("Volatile memory connected");
    }

    String seek(int address) {
        System.out.println("Seeking data from address " + address);
        return new String(address + ": Data");
    }

    void write(int address, String data) {
        System.out.println("Writing " + data + " to address " + address);
    }
}
