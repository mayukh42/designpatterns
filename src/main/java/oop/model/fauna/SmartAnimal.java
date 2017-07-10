package oop.model.fauna;

/**
 * Created by mayukh42 on 12/5/17.
 * The smart animal which allows to be used as composition rather than ancestor
 * Delegate: One who delegates messages to a receiver
 * The Runner interface decouples SmartDog and SmartAnimal
 */
public class SmartAnimal {

    public void call(Runner dog) {  // dog is the receiver used by delegate
        System.out.println("The smart animal calls...");
        dog.run();
    }
}
