package oop.model.fauna;

/**
 * Created by mayukh42 on 14/5/17.
 */
public abstract class Species implements Cloneable {

    private String name;
    private Sex sex;

    @Override
    protected Species clone() throws CloneNotSupportedException {
        return (Species) super.clone();
    }

    /**
     * create() is a wrapper on clone, which handles exception within itself.
     * Use species.create() to create a species by cloning.
     */
    public Species create() {
        Species cloned = null;
        try {
            cloned = this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
