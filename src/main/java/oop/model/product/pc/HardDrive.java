package oop.model.product.pc;

/**
 * Created by mayukh42 on 29/5/17.
 *
 * Complex component
 */
public class HardDrive {

    String seek(int sector) {
        System.out.println("Seeking data from sector " + sector);
        return new String(sector + ": Data");
    }

    void format() {
        System.out.println("Cleaning out all data");
    }

    void write(int sector, String data) {
        System.out.println("Writing " + data + " to sector " + sector);
    }

    void stop() {
        System.out.println("Hard drive being shut down");
    }
}
