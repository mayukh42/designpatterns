package oop.patterns.gof;

import oop.model.product.auto.mfg.*;

import java.util.List;

/**
 * Created by mayukh42 on 15/5/17.
 *
 * The Visitor Design Pattern
 *  For m visited components and n visitors, m*n methods are required across the visitor (concrete) classes (Visitor
 *  pattern is analogous to a matrix in 2 dimensions).
 *
 *  Visitor pattern involves dual dispatch because there are two polymorphic dispatches. The first is the inspect
 *  function. This dispatch resolves the type of the object that inspect is called upon. The second dispatch is the
 *  visit method called from the resolved accept method. The second dispatch resolves to the particular function
 *  to be executed (this is done by overloading, at compile time).
 */
public class Visitor {

    private List<ShopInspector> visitors;
    private List<ShopFloorComponent> components;

    public Visitor(List<ShopInspector> visitors, List<ShopFloorComponent> components) {
        this.visitors = visitors;
        this.components = components;
    }

    public void qualityChecks() {
        QualityConsultant qc = (QualityConsultant) visitors.get(0);
        for (ShopFloorComponent component : components) {
            /* Double dispatch #1: ShopFloorComponent
                Exact type of the component is resolved at runtime.
                    A ShopFloorComponent is abstract or interface; actual concrete type of component is resolved
                    at runtime. Inside inspect(), the 'this' is of concrete type of the component.
            */
            component.inspect(qc);
            System.out.println("Component: " + component.getClass().getSimpleName() + ", " + component.getDisposition());
        }
    }

    public void overseerChecks() {
        GovernmentOverseer overseer = (GovernmentOverseer) visitors.get(1);
        for (ShopFloorComponent component : components) {
            component.inspect(overseer);
            System.out.println("Component: " + component.getClass().getSimpleName() + ", " + component.getDisposition());
        }
    }
}
