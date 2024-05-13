package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("/plus")
    public String calculatePlus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return a + " / " + b + " = " + calculatorService.calculatePlus(a, b);
    }

    @GetMapping("/minus")
    public String calculateMinus(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return a + " / " + b + " = " + calculatorService.calculateMinus(a, b);
    }

    @GetMapping("/multiply")
    public String calculateMultiply(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return a + " / " + b + " = " + calculatorService.calculateMultiply(a, b);
    }

    @GetMapping("/divide")
    public String calculateDivide(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b) {
        return a + " / " + b + " = " + calculatorService.calculateDivide(a, b);
    }

}
