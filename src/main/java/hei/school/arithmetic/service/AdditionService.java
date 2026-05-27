package hei.school.arithmetic.service;

import org.springframework.stereotype.Service;

@Service
public class AdditionService {

  public double add(double a, double b) {
    return a + b;
  }
}