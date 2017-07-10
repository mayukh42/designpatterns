package oop.model.product.auto.mfg;

/**
 * Created by mayukh42 on 15/5/17.
 *
 * Concrete visitor
 */
public class QualityConsultant implements ShopInspector {

    @Override
    public void visit(BodyShell component) {
        System.out.println("Quality Consultant inspecting Body Shell");
        if (component.assembled && component.testInference.equals(Quality.OK) && component.painted)
            component.setDisposition(Quality.PASS);
        else
            component.setDisposition(Quality.FAIL);
    }

    @Override
    public void visit(Tires component) {
        System.out.println("Quality Consultant inspecting tires");
        if (component.testInference.equals(Quality.OK))
            component.setDisposition(Quality.PASS);
        else
            component.setDisposition(Quality.FAIL);
    }

    @Override
    public void visit(Engine component) {
        System.out.println("Quality Consultant inspecting engine");
        if (component.assembled && component.testInference.equals(Quality.PASS) && component.painted)
            component.setDisposition(Quality.PASS);
        else
            component.setDisposition(Quality.FAIL);
    }
}
