package oop.model.utilities.types;

import oop.model.utilities.ds.Pair;

/**
 * Created by mayukh42 on 4/6/17.
 *
 * Pair type (Key, Value pair)
 * Note that PairType is not RootType
 */
public class PairType {

    private Pair<String, RootType> kv;

    public PairType(String key, RootType value) {
        this.kv = new Pair<>(key, value);
    }

    public String getKey() {
        return kv.getFirst();
    }

    public RootType getValue() {
        return kv.getSecond();
    }

    @Override
    public String toString() {
        return kv.getFirst() + " : " + kv.getSecond().toString() + "\n";
    }
}
