package oop.model.fauna;

/**
 * Created by mayukh42 on 12/5/17.
 * A smart dog that does not use inheritance
 * Receiver
 */
public class SmartDog implements Runner {

    private SmartAnimal animal;     // delegate
    private String name;

    public SmartDog(SmartAnimal animal, String name) {
        this.animal = animal;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running!");
    }

    public void work() {
        animal.call(this);  // Delegate is passed an instance of receiver, which delegate can use within
    }
}
