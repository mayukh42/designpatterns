package oop.model.cad;

/**
 * Created by mayukh42 on 23/5/17.
 */
public enum Color {

    WHITE, BLACK, RED, GREEN, BLUE, CYAN, MAGENTA, YELLOW;

    public Color inverse() {
        if (this.equals(WHITE))
            return BLACK;
        else if (this.equals(BLACK))
            return WHITE;
        else if (this.equals(RED))
            return CYAN;
        else if (this.equals(GREEN))
            return MAGENTA;
        else if (this.equals(BLUE))
            return YELLOW;
        else if (this.equals(CYAN))
            return RED;
        else if (this.equals(MAGENTA))
            return GREEN;
        else
            return BLUE;
    }
}
