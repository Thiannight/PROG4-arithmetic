package hei.school.arithmetic.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SubtractionServiceTest {

  @InjectMocks
  private SubtractionService subtractionService;

  @Test
  void subtract_two_positive_numbers() {
    assertEquals(1.0, subtractionService.subtract(3, 2));
  }

  @Test
  void subtract_gives_negative() {
    assertEquals(-1.0, subtractionService.subtract(2, 3));
  }

  @Test
  void subtract_two_negatives() {
    assertEquals(1.0, subtractionService.subtract(-2, -3));
  }

  @Test
  void subtract_zero() {
    assertEquals(5.0, subtractionService.subtract(5, 0));
  }

  @Test
  void subtract_same_numbers() {
    assertEquals(0.0, subtractionService.subtract(7, 7));
  }
}