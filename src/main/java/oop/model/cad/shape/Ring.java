package oop.model.cad.shape;

/**
 * Created by mayukh42 on 23/5/17.
 */
public class Ring extends Shape {

    private double outerRadius;
    private double innerRadius;

    public Ring(Draw artist) {
        super(artist);
        outerRadius = 0d;
        innerRadius = 0d;
    }

    public Ring(Draw artist, double outerRadius, double innerRadius) {
        super(artist);
        this.outerRadius = outerRadius;
        this.innerRadius = innerRadius;
    }

    @Override
    public double getArea() {
        return Math.PI * (outerRadius * outerRadius - innerRadius * innerRadius);
    }
}
