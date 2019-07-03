package Zad3Kalkulator;

import org.assertj.core.data.Offset;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void add_a5_5() {
        calculator.clear();
        double expected = 5;
        calculator.add(5);
        double actual = calculator.getVariable();
        assertThat(expected).isEqualTo(actual, Offset.strictOffset(0.1));
    }

    @Test
    public void sub_an3_n3() {
        calculator.clear();
        double expected = -3;
        calculator.sub(3);
        double actual = calculator.getVariable();
        assertThat(expected).isEqualTo(actual, Offset.strictOffset(0.1));
    }

    @Test
    public void multiplay_a2b3_6() {
        calculator.clear();
        calculator.add(2);
        double expected = 6;
        calculator.multiplay(3);
        double actual = calculator.getVariable();
        assertThat(expected).isEqualTo(actual, Offset.strictOffset(0.1));

    }

    @Test
    public void divide_a6b3_2() {
        calculator.clear();
        calculator.add(6);
        double expected=2;
        calculator.divide(3);
        double actual=calculator.getVariable();
        assertThat(expected).isEqualTo(actual,Offset.strictOffset(0.1));
    }
    @Test(expected=IllegalArgumentException.class)
    public void divide_a6b0_IllegalArgumentExceptionThrow(){
        calculator.clear();
        calculator.add(6);
        calculator.divide(0);
    }

    @Test
    public void clear__0() {
        calculator.add(10);
        double expected = 0;
        calculator.clear();
        double actual = calculator.getVariable();
        assertThat(expected).isEqualTo(actual, Offset.strictOffset(0.1));
    }
}