package oop.model.product.auto.mfg;

/**
 * Created by mayukh42 on 15/5/17.
 */
public class Tires extends ShopFloorComponent {

    @Override
    public void inspect(ShopInspector inspector) {
        inspector.visit(this);
    }

    @Override
    public void assemble() {
        System.out.println("Not applicable");
    }

    @Override
    public void test() {
        System.out.println("Tested all 5 tires");
        this.testInference = Quality.OK;
    }

    @Override
    public void paint() {
        System.out.println("Not applicable");
    }
}
