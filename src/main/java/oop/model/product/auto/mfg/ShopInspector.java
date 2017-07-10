package oop.model.product.auto.mfg;

/**
 * Created by mayukh42 on 15/5/17.
 *
 * Visitor @ Visitor pattern
 */
public interface ShopInspector {

    /* visit methods: one for each component
       Static dispatch:
            the component is resolved statically since overloading is resolved at compile time.
      */
    void visit(BodyShell component);
    void visit(Tires component);
    void visit(Engine component);
}
