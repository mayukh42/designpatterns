package oop.model.product.auto.mfg;

/**
 * Created by mayukh42 on 15/5/17.
 *
 * The visited in Visitor pattern
 */
public abstract class ShopFloorComponent {

    protected boolean assembled;
    protected Quality testInference;
    protected boolean painted;

    /* to be used by visitor */
    protected Quality disposition;

    protected abstract void assemble();
    protected abstract void test();
    protected abstract void paint();

    /* visitor method
        Double dispatch #2: ShopInspector
            Exact type of the inspector is resolved at runtime.
     */
    public abstract void inspect(ShopInspector inspector);

    public Quality getDisposition() {
        return disposition;
    }

    public void setDisposition(Quality disposition) {
        this.disposition = disposition;
    }
}
