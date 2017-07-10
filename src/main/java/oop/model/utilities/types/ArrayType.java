package oop.model.utilities.types;

import java.util.List;

/**
 * Created by mayukh42 on 4/6/17.
 */
public class ArrayType extends RootType {

    private int count;
    private List<RootType> array;

    public ArrayType(List<RootType> array) {
        this.array = array;
        count = 0;
    }

    public List<RootType> getArray() {
        return array;
    }

    @Override
    public ArrayType getObject() {
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (RootType element : array)
            sb.append(element.toString()).append(", ");
        sb.append("]");
        return sb.toString();
    }
}
