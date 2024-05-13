package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTestParameterized {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTestPlus")
    public void shouldReturnCorrectValueForPlus() {
        Integer result = out.calculatePlus(2, 4);
        Integer result2 = out.calculatePlus(3, 2);

        Assertions.assertEquals(6, result);
        Assertions.assertEquals(5, result2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestMinus")
    public void shouldReturnCorrectValueForMinus() {
        Integer result = out.calculateMinus(5, 4);
        Integer result2 = out.calculateMinus(4, 2);

        Assertions.assertEquals(1, result);
        Assertions.assertEquals(2, result2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestMultiply")
    public void shouldReturnCorrectValueForMultiply() {
        Integer result = out.calculateMultiply(2, 4);
        Integer result2 = out.calculateMultiply(3, 2);

        Assertions.assertEquals(8, result);
        Assertions.assertEquals(6, result2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestDivide")
    public void shouldReturnCorrectValueForDivide() {
        Integer result = out.calculateDivide(8, 2);
        Integer result2 = out.calculateDivide(4, 2);

        Assertions.assertEquals(4, result);
        Assertions.assertEquals(2, result2);
    }

    public static Stream<Arguments> provideParamsForTestPlus() {
        return Stream.of(
                Arguments.of(0,2,2),
                Arguments.of(2,4,6)
        );
    }

    public static Stream<Arguments> provideParamsForTestMinus() {
        return Stream.of(
                Arguments.of(0,2,-2),
                Arguments.of(6,4,2)
        );
    }

    public static Stream<Arguments> provideParamsForTestMultiply() {
        return Stream.of(
                Arguments.of(0,2,0),
                Arguments.of(2,4,8)
        );
    }

    public static Stream<Arguments> provideParamsForTestDivide() {
        return Stream.of(
                Arguments.of(2,2,1),
                Arguments.of(8,4,2)
        );
    }


}
