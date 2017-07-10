package oop.model.product.auto.mfg;

/**
 * Created by mayukh42 on 15/5/17.
 */
public class Engine extends ShopFloorComponent {

    @Override
    public void inspect(ShopInspector inspector) {
        inspector.visit(this);
    }

    @Override
    public void assemble() {
        System.out.println("Assembling engine");
        this.assembled = true;
    }

    @Override
    public void test() {
        System.out.println("Testing engine");
        this.testInference = Quality.PASS;
    }

    @Override
    public void paint() {
        System.out.println("Painting engine with anti-rust coat");
        this.painted = true;
    }
}
