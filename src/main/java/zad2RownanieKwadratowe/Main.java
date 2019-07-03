package zad2RownanieKwadratowe;

public class Main {
    public static void main(String[] args) {
        final int a = -1;
        final int b = -4;//2
        final int c = 3;

        QuadraticEquation rownanie = new QuadraticEquation(a, b, c);

        try {
            System.out.println(String.format("Rozwiazaniem rownania o wspolczynikach a=%d,b=%d,c=%d jest\nX1:%.2f \nX2:%.2f ",
                    a, b, c, rownanie.getX1(), rownanie.getX2()));
        } catch (NoSolutionForQuadricException e) {
            e.printStackTrace();
        }

        System.out.println("Dziekuje-> test czy dojdzie tu po wyjątku ");
    }
}
