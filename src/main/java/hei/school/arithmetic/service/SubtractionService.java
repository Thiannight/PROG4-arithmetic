package hei.school.arithmetic.service;

import org.springframework.stereotype.Service;

@Service
public class SubtractionService {

    public double subtract(double a, double b) {
        return a - b;
    }
}
