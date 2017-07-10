package oop.model.utilities.types;

/**
 * Created by mayukh42 on 4/6/17.
 */
public class StringType extends RootType {

    private String value;

    public StringType(String value) {
        this.value = value;
    }

    @Override
    public String getObject() {
        return value;
    }

    /**
     * return a Hungarian notation of the value
     */
    @Override
    public String toString() {
        return "s'" + value;
    }
}
