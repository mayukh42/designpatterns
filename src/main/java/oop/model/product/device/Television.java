package oop.model.product.device;

/**
 * Created by mayukh42 on 25/5/17.
 *
 * Television that draws current when switched on
 *  Generic ElectricAppliance implementation
 */
public class Television implements ElectricAppliance {

    @Override
    public void drawCurrent() {
        System.out.println("Television drawing current.");
    }
}
