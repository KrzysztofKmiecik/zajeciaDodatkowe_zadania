package zad2RownanieKwadratowe;

import org.assertj.core.data.Offset;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class QuadraticEquationTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getX1_a1b4c3_n3() { //n3  means -3
        final int a = 1;
        final int b = 4;
        final int c = 3;

        QuadraticEquation rownanie = new QuadraticEquation(a, b, c);

        double expected = -3;
        double actual = rownanie.getX1();
        Assert.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void getX2_a1b4c3_n1() {
        final int a = 1;
        final int b = 4;
        final int c = 3;

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double expected = -1;
        double actual = equation.getX2();
        Assert.assertEquals(expected, actual, 0.1);

    }

    @Test
    public void getX1_a1b2c3_NoSolutionForQuadricExceptionTryToCatch() {
        final int a = 1;
        final int b = 2;
        final int c = 3;

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        try {
            equation.getX1();
            Assert.assertTrue(true);
        } catch (NoSolutionForQuadricException e) {
            return;
        }
        Assert.fail("There is NO expected NoSolutionForQuadricException");
    }


    @Test(expected = NoSolutionForQuadricException.class)
    public void getX2_a1b2c3_NoSolutionForQuadricExceptionTryToCatch() {
        final int a = 1;
        final int b = 2;
        final int c = 3;

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        equation.getX2();
    }

//    @Test
//    @Parameters({"1,4,3,-1", "1,-4,3,1"})
//    public void getX1_parametrized(int a, int b, int c, double expected) {
//        QuadraticEquation equation = new QuadraticEquation(a, b, c);
//        double actual = equation.getX1();
//        assertThat(expected).isEqualTo(actual, Offset.strictOffset(0.1));
//    }

    @Test
    public void getX1_a1b2c1_n1() {
        final int a = 1;
        final int b = 2;
        final int c = 1;

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double expected = -1;
        double actual = equation.getX1();

        assertThat(expected).isEqualTo(actual, Offset.strictOffset(0.1));
    }

    @Test(expected = NoSolutionForQuadricException.class)
    public void getX2_a1b2c1_NoSolutionForQuadricException() {
        final int a = 1;
        final int b = 2;
        final int c = 1;
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        equation.getX2();
    }

}