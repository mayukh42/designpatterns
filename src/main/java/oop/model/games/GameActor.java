package oop.model.games;

/**
 * Created by mayukh42 on 25/5/17.
 *
 * Game character. Subclasses must define how to play him.
 */
public abstract class GameActor {

    protected final String name;
    protected String faction;
    protected int age;
    protected double health;

    public GameActor(String name, double health) {
        this.name = name;
        this.health = health;
        this.age = 30;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFaction() {
        return faction;
    }

    public int getAge() {
        return age;
    }

    public double getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return name + " of " + faction;
    }

    public abstract void play();
}
