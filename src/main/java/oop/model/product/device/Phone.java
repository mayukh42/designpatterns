package oop.model.product.device;

/**
 * Created by mayukh42 on 25/5/17.
 *
 * An electronic device that runs on chargeable battery
 *  With each charging session, the phone's charge increases by 20%
 */
public class Phone extends Device {

    private String make;

    public Phone(String make) {
        this.make = make;
        this.chargeLeft = 50d;
    }

    @Override
    public void charge() {
        System.out.println("Phone is being charged.");
        chargeLeft += 20d;
    }

    public String getMake() {
        return make;
    }
}
