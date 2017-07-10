package oop.model.product.auto.mfg;

/**
 * Created by mayukh42 on 15/5/17.
 */
public class BodyShell extends ShopFloorComponent {

    /* Double dispatch #1: this (ShopFloorComponent)
        Exact type of the component is resolved at runtime.
       Double dispatch #2: ShopInspector
        Exact type of the inspector is resolved at runtime.
      */
    @Override
    public void inspect(ShopInspector inspector) {
        inspector.visit(this);
    }

    @Override
    public void assemble() {
        System.out.println("Assembling a body shell");
        this.assembled = true;
    }

    @Override
    public void test() {
        System.out.println("Testing a body shell");
        this.testInference = Quality.OK;
    }

    @Override
    public void paint() {
        System.out.println("Painting a body shell");
        this.painted = true;
    }
}
