package Ex3Calculator;

public class Calculator {

    private double variable;


    public double getVariable() {
        return variable;
    }

    public void add(double variable) {
        this.variable += variable;
    }

    public void sub(double variable) {
        this.variable -= variable;
    }

    public void multiplay(double variable) {
        this.variable *= variable;
    }

    public void divide(double variable) {
        if (variable == 0.0) {
            throw new IllegalArgumentException();
        }
        this.variable /= variable;
    }

    public void clear() {
        this.variable = 0;
    }
}
