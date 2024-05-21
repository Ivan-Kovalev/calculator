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
    public void shouldReturnCorrectValueForPlus(Integer a, Integer b, Integer result) {
        Integer exResult = out.calculatePlus(a, b);
        Assertions.assertEquals(result, exResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestMinus")
    public void shouldReturnCorrectValueForMinus(Integer a, Integer b, Integer result) {
        Integer exResult = out.calculateMinus(a, b);
        Assertions.assertEquals(result, exResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestMultiply")
    public void shouldReturnCorrectValueForMultiply(Integer a, Integer b, Integer result) {
        Integer exResult = out.calculateMultiply(a, b);
        Assertions.assertEquals(result, exResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTestDivide")
    public void shouldReturnCorrectValueForDivide(Integer a, Integer b, Integer result) {
        Integer exResult = out.calculateDivide(a, b);
        Assertions.assertEquals(result, exResult);
    }

    public static Stream<Arguments> provideParamsForTestPlus() {
        return Stream.of(
                Arguments.of(0, 2, 2),
                Arguments.of(2, 4, 6)
        );
    }

    public static Stream<Arguments> provideParamsForTestMinus() {
        return Stream.of(
                Arguments.of(0, 2, -2),
                Arguments.of(6, 4, 2)
        );
    }

    public static Stream<Arguments> provideParamsForTestMultiply() {
        return Stream.of(
                Arguments.of(0, 2, 0),
                Arguments.of(2, 4, 8)
        );
    }

    public static Stream<Arguments> provideParamsForTestDivide() {
        return Stream.of(
                Arguments.of(2, 2, 1),
                Arguments.of(8, 4, 2)
        );
    }


}
