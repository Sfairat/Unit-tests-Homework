package seminars.first.Calculator;

import seminars.first.Calculator.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        assertThat(Calculator.calculateDiscount(576, 15)).isEqualTo(489.6);
        assertThat(Calculator.calculateDiscount(1617.14, 35)).isEqualTo(1051.141);
        assertThat(Calculator.calculateDiscount(-10, 10)).isEqualTo(-9);
        assertThat(Calculator.calculateDiscount(0, 10)).isEqualTo(0);
        assertThat(Calculator.calculateDiscount(100, -10)).isEqualTo(110);
    }
}