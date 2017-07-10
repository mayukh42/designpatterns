package oop.model.product.device;

/**
 * Created by mayukh42 on 25/5/17.
 *
 * A simple abstraction for device types so that clients can pass messages normalized.
 */
public abstract class Device  implements Chargeable {

    protected double chargeLeft;

    public double getChargeLeft() {
        return chargeLeft;
    }
}
