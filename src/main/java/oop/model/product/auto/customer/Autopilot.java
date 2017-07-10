package oop.model.product.auto.customer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mayukh42 on 15/5/17.
 *
 * Command factory
 */
public class Autopilot {

    private static Map<String, DriverCommand> commands = new HashMap<>();

    public void addBasicDrivingActivities() {
        addCommand("Start", (car) -> {
            car.startEngine();
            System.out.println("Engine started; " + car);
        });
        addCommand("Accelerate", (car) -> {
            car.accelerate();
            System.out.println("Accelerating; " + car);
        });
        addCommand("Brake", (car) -> {
            car.brake();
            System.out.println("Braked; " + car);
        });
        addCommand("Refuel", (car) -> {
            car.refuel(20d);
            System.out.println("Refueled; " + car);
        });
        addCommand("Stop", (car) -> {
            car.stopEngine();
            System.out.println("Engine stopped; " + car);
        });
    }

    public void addCommand(String name, DriverCommand command) {
        commands.putIfAbsent(name, command);
    }

    public DriverCommand getCommand(String name) {
        return commands.get(name);
    }

    public void listCommands() {
        for (String command : commands.keySet())
            System.out.println(command);
    }
}
