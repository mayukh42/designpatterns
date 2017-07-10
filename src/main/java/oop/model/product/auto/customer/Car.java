package oop.model.product.auto.customer;

/**
 * Created by mayukh42 on 15/5/17.
 *
 * Receiver in Command pattern
 *  Decoupled from Command; does not know of DriverCommand interface's existence
 */
public class Car {

    private String name;
    private boolean running;
    private double speed;
    private double fuel;

    public Car(String name) {
        this.name = name;
        this.fuel = 20d;
    }

    @Override
    public String toString() {
        return name + (running ? " @ " + speed + " kmph with " + fuel + " litres remaining" : "@ stopped");
    }

    public void startEngine() {
        running = true;
        speed = 0d;
    }

    public void stopEngine() {
        running = false;
        speed = 0d;
    }

    public void refuel(double amount) {
        if (amount + fuel <= 50d)
            fuel += amount;
        else fuel = 50d;
    }

    public void accelerate() {
        speed += 10d;
        fuel -= 2d;
        if (fuel <= 0d) stopEngine();
        if (speed > 100d) brake();
    }

    public void brake() {
        if (speed >= 10d)
            speed -= 10d;
    }
}
