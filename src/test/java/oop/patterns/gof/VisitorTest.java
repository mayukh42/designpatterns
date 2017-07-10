package oop.patterns.gof;

import oop.model.product.auto.mfg.*;
import oop.patterns.gof.Visitor;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mayukh42 on 15/5/17.
 */
public class VisitorTest {

    private final List<ShopInspector> visitors = Arrays.asList(
            new QualityConsultant(),
            new GovernmentOverseer()
    );

    private final List<ShopFloorComponent> components = Arrays.asList(
            new BodyShell(),
            new Tires(),
            new Engine()
    );

    /* runProcesses(): Run MFG processes on the shop floor
        prerequisite for quality control
     */
    private void runProcesses() {
        BodyShell shell = (BodyShell) components.get(0);
        shell.assemble();
        shell.paint();
        shell.test();

        Tires tires = (Tires) components.get(1);
        tires.test();

        Engine engine = (Engine) components.get(2);
        engine.assemble();
        engine.paint();
        engine.test();
    }

    @Test
    public void shopQualityControl() {
        runProcesses();
        Visitor visitor = new Visitor(visitors, components);

        /* quality checks must happen before overseer checks
            because overseer disposes based on quality consultant's disposition
         */
        visitor.qualityChecks();
        visitor.overseerChecks();
    }
}
