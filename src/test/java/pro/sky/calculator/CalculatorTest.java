package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnCorrectValueForPlus() {
        Integer result = out.calculatePlus(2, 4);
        Integer result2 = out.calculatePlus(3, 2);

        Assertions.assertEquals(6, result);
        Assertions.assertEquals(5, result2);
    }

    @Test
    public void shouldReturnCorrectValueForMinus() {
        Integer result = out.calculateMinus(5, 4);
        Integer result2 = out.calculateMinus(4, 2);

        Assertions.assertEquals(1, result);
        Assertions.assertEquals(2, result2);
    }

    @Test
    public void shouldReturnCorrectValueForMultiply() {
        Integer result = out.calculateMultiply(2, 4);
        Integer result2 = out.calculateMultiply(3, 2);

        Assertions.assertEquals(8, result);
        Assertions.assertEquals(6, result2);
    }

    @Test
    public void shouldReturnCorrectValueForDivide() {
        Integer result = out.calculateDivide(8, 2);
        Integer result2 = out.calculateDivide(4, 2);

        Assertions.assertEquals(4, result);
        Assertions.assertEquals(2, result2);
    }

    @Test
    public void shouldThrowIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.calculateDivide(3, 0));
    }


}
