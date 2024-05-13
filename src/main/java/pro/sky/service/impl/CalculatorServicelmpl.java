package pro.sky.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.service.CalculatorService;

@Service
public class CalculatorServicelmpl implements CalculatorService {
    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int devide(int a, int b) {
        return a / b;
    }
}
