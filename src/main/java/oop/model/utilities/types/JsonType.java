package oop.model.utilities.types;

/**
 * Created by mayukh42 on 4/6/17.
 *
 * At high level, a JSON is a list of (k, v) pairs. Each k is a string, and each v is a JSON. Example of a JSON data:
 *  json = {
 *      name: Alice,
 *      age: 33,
 *      languages: [C, C++, Java, Python]
 *      education: [{
 *              name: BS,
 *              college: Stanford,
 *              grade: A
 *          }, {
 *              name: MS,
 *              college: MIT,
 *              grade: B
 *          }, {
 *              name: PhD,
 *              college: MIT,
 *              grade: A
 *          }]
 *  }
 *
 * TODO: alignment
 */
public class JsonType extends RootType {

    private PairType[] elements;
    private static int level = 0;

    public JsonType(PairType... elements) {
        this.elements = elements;
    }

    @Override
    public JsonType getObject() {
        return this;
    }

    /**
     * TODO: alignment
     */
    private void resetTabs() {
        level = 0;
    }

    /**
     * TODO: alignment
     */
    private String tabs() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) sb.append("\t");
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{\n");
        for (PairType kv : elements)
            sb.append(kv.getKey()).append(": ").append(kv.getValue()).append(",\n");
        sb.append("}\n");
        return sb.toString();
    }
}
