package oop.patterns.gof;

import oop.model.utilities.persist.MyData;
import oop.model.utilities.persist.PersistJSON;
import oop.model.utilities.persist.PersistXML;

import java.util.Scanner;

/**
 * Created by mayukh42 on 3/6/17.
 *
 * The Observer design pattern (Publish-Subscribe model)
 * Variant 1: Tightly coupled: Observers register themselves to the observable; so producer directly knows about its
 *  consumers
 * Variant 2: Loosely coupled: Observers register with a Message Queue, with which even the observable registers. The MQ
 *  acts as a Mediator (see Mediator design pattern) to decouple the observable from its observers. Neither side knows
 *  about one another.
 *
 *  TODO: implement sentinel input
 */
public class Observer implements Runnable {

    private static final String path = "target/";

    private MyData myData;
    private Scanner scanner;

    public Observer() {
        this.myData = new MyData();
        this.scanner = new Scanner(System.in);

        myData.addObserver(new PersistJSON(path + "json_output.txt"));
        myData.addObserver(new PersistXML(path + "xml_output.txt"));
    }

    @Override
    public void run() {
        String row;
        while (true) {
            System.out.print("Enter comma-separated label and data: ");
            row = scanner.nextLine();
            String[] labelAndData = row.split(",");

            if (labelAndData.length == 2) myData.changeData(labelAndData[0], labelAndData[1]);
        }
    }
}
