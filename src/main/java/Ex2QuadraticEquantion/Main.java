package Ex2QuadraticEquantion;

public class Main {
    public static void main(String[] args) {
        final int a = -1;
        final int b = -4;//2
        final int c = 3;

        QuadraticEquation rownanie = new QuadraticEquation(a, b, c);

        try {
            System.out.println(String.format("Solution of the quadratic equation with factors   a=%d,b=%d,c=%d is\nX1:%.2f \nX2:%.2f ",
                    a, b, c, rownanie.getX1(), rownanie.getX2()));
        } catch (NoSolutionForQuadraticException e) {
            e.printStackTrace();
        }

        System.out.println("Thank You-> This is a test if reach this point after exception ");
    }
}
/*OUTPUT
Solution of the quadratic equation with factors   a=-1,b=-4,c=3 is
X1:0,65
X2:-4,65
Thank You-> This is a test if reach this point after exception

Process finished with exit code 0


 */
