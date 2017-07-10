package oop.model.fauna;

/**
 * Created by mayukh on 12/5/17.
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + " is running!");
    }

    public void work() {
        this.call();
    }
}
