package oop.model.product.device;

/**
 * Created by mayukh42 on 25/5/17.
 *
 * Adapter: implements ElectricAppliance interface and bridges with Chargeable interface by composition
 *  Could be vice-versa, i.e. it is a 2-way bridge
 */
public class DeviceCharger implements ElectricAppliance {   // implements one interface

    /* hold other interface by composition */
    private Chargeable device;

    public DeviceCharger(Chargeable device) {
        this.device = device;
    }

    /**
     * Meat of the Adapter design pattern
     *  Implements the expected method in such a way that message is passed to the other interface
     *  Can also be called Facade for the other interface
     */
    @Override
    public void drawCurrent() {
        System.out.println("Adapter is on");
        device.charge();
    }

    public Chargeable getDevice() {
        return device;
    }

    public void setDevice(Chargeable device) {
        this.device = device;
    }
}
