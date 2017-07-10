package oop.model.fauna;

/**
 * Created by mayukh42 on 12/5/17.
 */
public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void call() {
        System.out.println("Call of the animal within...");

        /* Open recursion and dynamic dispatch
        * Open recursion: calling abstract method that will be defined in a subclass later.
        *   It is a recursion because the subclass is a parent type, so it is recursive in type context.
        *
        * Dynamic Dispatch: 'this' = child concrete class that implements run()
        * */
        this.run();
    }

    public abstract void run();
}
