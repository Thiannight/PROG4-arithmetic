package hei.school.arithmetic.service;

import org.springframework.stereotype.Service;

@Service
public class MultiplicationService {

    public double multiply(double a, double b) {
        return a * b;
    }
}