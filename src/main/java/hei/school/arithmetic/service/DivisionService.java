package hei.school.arithmetic.service;

import org.springframework.stereotype.Service;

@Service
public class DivisionService {

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}