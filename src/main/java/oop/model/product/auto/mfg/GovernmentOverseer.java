package oop.model.product.auto.mfg;

/**
 * Created by mayukh42 on 15/5/17.
 */
public class GovernmentOverseer implements ShopInspector {

    @Override
    public void visit(BodyShell component) {
        System.out.println("Government Overseer inspecting Body Shell");
        if (component.getDisposition().equals(Quality.PASS))
            component.setDisposition(Quality.APPROVE);
        else
            component.setDisposition(Quality.REJECT);
    }

    @Override
    public void visit(Tires component) {
        System.out.println("Government Overseer inspecting tires");
        if (component.getDisposition().equals(Quality.PASS))
            component.setDisposition(Quality.APPROVE);
        else
            component.setDisposition(Quality.REJECT);
    }

    @Override
    public void visit(Engine component) {
        System.out.println("Government Overseer inspecting engine");
        if (component.getDisposition().equals(Quality.PASS))
            component.setDisposition(Quality.APPROVE);
        else
            component.setDisposition(Quality.REJECT);
    }
}
