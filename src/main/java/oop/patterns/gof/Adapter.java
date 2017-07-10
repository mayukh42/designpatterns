package oop.patterns.gof;

import oop.model.product.device.Device;
import oop.model.product.device.DeviceCharger;
import oop.model.product.device.ElectricAppliance;

/**
 * Created by mayukh42 on 25/5/17.
 *
 * The Adapter Design Pattern
 *  Adapt one interface into another. The adapter implements one interface (the one which client expects), within whose
 *  methods it calls the methods of the other interface. The latter is held as reference (composition) to which the
 *  adapter delegates messages.
 *
 *  Similarity with Bridge: One abstraction holds the other as reference.
 *
 *  Difference with Bridge: In bridge no interface is implemented whereas in adapter one is implemented (the interface
 *  that client expects) and other is held by composition (the interface that client need not know about, since it
 *  expects only the first interface).
 *      IOW, there is less coupling in Adapter than in Bridge. For example, in Bridge the client needs to know the
 *      interface of the contained object, whereas in Adapter the client only calls the methods of the interface it
 *      knows (adapter abstracts out the other interface).
 *
 *  Similarity with Decorator: Adapter extends parent interface and delegates messages to other interface held by
 *  composition.
 *
 *  Difference with Decorator: Methods of composed object are just called, and results forwarded, rather than
 *  'decorating' the results.
 */
public class Adapter {

    public static double chargeDevice(Device device) {
        /* ElectricAppliance is the interface that client expects */
        ElectricAppliance charger = new DeviceCharger(device);

        /* charger delegates charge() message to the held device, when client calls its expected method. Client need not
         * know about this charge() method.
         */
        charger.drawCurrent();
        return device.getChargeLeft();
    }
}
