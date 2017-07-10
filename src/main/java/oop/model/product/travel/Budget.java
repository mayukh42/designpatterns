package oop.model.product.travel;

/**
 * Created by mayukh on 14/5/17.
 *
 * Travel budget
 */
public enum Budget {

    LIMITED, COMFORT, LUXURY;

    public double getFactor() {
        double factor;
        if (this.equals(Budget.LIMITED)) factor = 1d;
        else if (this.equals(Budget.COMFORT)) factor = 1.5d;
        else factor = 2d;
        return factor;
    }
}
