package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public Integer calculatePlus(Integer a, Integer b) {
        if (validateValue(a, b)) {
            return a + b;
        } else {
            throw new RuntimeException("Не указан один из параметров!");
        }
    }

    @Override
    public Integer calculateMinus(Integer a, Integer b) {
        if (validateValue(a, b)) {
            return a - b;
        } else {
            throw new RuntimeException("Не указан один из параметров!");
        }
    }

    @Override
    public Integer calculateMultiply(Integer a, Integer b) {
        if (validateValue(a, b)) {
            return a * b;
        } else {
            throw new RuntimeException("Не указан один из параметров!");
        }
    }

    @Override
    public Integer calculateDivide(Integer a, Integer b) {
        if (b == 0) {
            throw new IllegalArgumentException("У меня плохо получается делить на ноль) Попробуй другое число");
        } else if (validateValue(a, b)) {
            return a / b;
        } else {
            throw new RuntimeException("Не указан один из параметров!");
        }
    }

    private boolean validateValue(Integer a, Integer b) {
        return a != null && b != null;
    }

}
