package hei.school.arithmetic.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MultiplicationServiceTest {

  @InjectMocks
  private MultiplicationService multiplicationService;

  @Test
  void multiply_two_positive_numbers() {
    assertEquals(6.0, multiplicationService.multiply(2, 3));
  }

  @Test
  void multiply_positive_and_negative() {
    assertEquals(-6.0, multiplicationService.multiply(2, -3));
  }

  @Test
  void multiply_two_negatives() {
    assertEquals(6.0, multiplicationService.multiply(-2, -3));
  }

  @Test
  void multiply_by_zero() {
    assertEquals(0.0, multiplicationService.multiply(99, 0));
  }

  @Test
  void multiply_by_one() {
    assertEquals(5.0, multiplicationService.multiply(5, 1));
  }
}