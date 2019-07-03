package zad2RownanieKwadratowe;

public class QuadraticEquation {
    final private int a;
    final private int b;
    final private int c;

    public QuadraticEquation(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getDelta(final int a, final int b, final int c) {
        return (Math.pow(b, 2) - 4 * a * c);
    }

    private int checkDelta(double delta) {
        if (delta > 0.0) {
            return 1;
        } else if (delta < 0.0) {
            return -1;
        } else {
            return 0;
        }
    }

    private double getCount1(int a, int b) {
        return -b / (2 * a);
    }

    private double getCount2(double delta, int a) {
        return Math.sqrt(delta) / (2 * a);
    }

    public double getX1() throws NoSolutionForQuadricException {
        double myDelta = getDelta(this.a, this.b, this.c);
        switch (checkDelta(myDelta)) {
            case 1: {
                return getCount1(this.a, this.b) - getCount2(myDelta, this.a);
            }
            case 0: {
                return getCount1(this.a, this.b);
            }
        }
        throw new NoSolutionForQuadricException("Nie ma rozwiazania X1 dla tego rownania Delta <0");
    }

    public double getX2() throws NoSolutionForQuadricException {
        double myDelta = getDelta(this.a, this.b, this.c);
        switch (checkDelta(myDelta)) {
            case 1: {
                return getCount1(this.a, this.b) + getCount2(myDelta, this.a);
            }
            case 0: {
                throw new NoSolutionForQuadricException("Nie ma rozwiazania X2 dla tego rownania Delta == ó0");
            }
        }
        throw new NoSolutionForQuadricException("Nie ma rozwiazania X2 dla tego rownania Delta <0");
    }
}
