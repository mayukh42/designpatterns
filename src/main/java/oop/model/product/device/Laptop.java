package oop.model.product.device;

/**
 * Created by mayukh42 on 25/5/17.
 *
 * An electronic device that runs on chargeable battery
 *  With each charging session, the laptop's charge increases by 10%
 */
public class Laptop extends Device {

    private String model;

    public Laptop(String model) {
        this.model = model;
        this.chargeLeft = 50d;
    }

    @Override
    public void charge() {
        System.out.println("Laptop is being charged.");
        chargeLeft += 10d;
    }

    public String getModel() {
        return model;
    }
}
