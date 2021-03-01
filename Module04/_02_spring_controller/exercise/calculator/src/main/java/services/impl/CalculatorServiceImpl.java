package services.impl;

import org.springframework.stereotype.Service;
import services.ICalculatorService;

@Service
public class CalculatorServiceImpl implements ICalculatorService {
    @Override
    public double calculator(int num1, int num2, String val) {
        switch (val) {
            case "+": {
                return num1 + num2;
            }
            case "-": {
                return num1 - num2;
            }
            case "*": {
                return num1 * num2;
            }
            case "/": {
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Divide by zero");
                }
            }
        }
        return 0;
    }
}
