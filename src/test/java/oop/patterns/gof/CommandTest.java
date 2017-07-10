package oop.patterns.gof;

import oop.patterns.gof.Command;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mayukh42 on 15/5/17.
 *
 * Client of Command Pattern
 *  Passes a command or a list of commands to the invoker. The invoker creates receiver either itself or obtains from
 *  some factory using the property given by the client. The client need not know of actual implementation of the
 *  receiver.
 */
public class CommandTest {

    @Test
    public void testDrive() {
        Command driver = new Command("Polo");
        List<String> drivePlan = Arrays.asList("Start", "Accelerate", "Brake", "Refuel", "Accelerate", "Brake", "Stop");
        driver.driveCar(drivePlan);
    }
}
