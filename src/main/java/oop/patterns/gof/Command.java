package oop.patterns.gof;

import oop.model.product.auto.customer.Autopilot;
import oop.model.product.auto.customer.Car;

import java.util.List;

/**
 * Created by mayukh42 on 15/5/17.
 *
 * Invoker of the Command Design Pattern
 *  The invoker takes a command or a list of commands from the client, and invokes them on the receiver. The invoker
 *  does housekeeping for the receiver (i.e. creates and maintains it, etc.).
 */
public class Command {

    private Autopilot autopilot;
    private Car car;

    public Command(String carName) {
        this.car = new Car(carName);
        this.autopilot = new Autopilot();
        this.autopilot.addBasicDrivingActivities();
    }

    public void driveCar(List<String> drivePlan) {
        for (String activity : drivePlan) {
            autopilot.getCommand(activity).apply(car);
        }
    }
}
