package hei.school.arithmetic.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class DivisionServiceTest {

  @InjectMocks
  private DivisionService divisionService;

  @Test
  void divide_two_positive_numbers() {
    assertEquals(2.0, divisionService.divide(6, 3));
  }

  @Test
  void divide_gives_decimal_result() {
    assertEquals(2.5, divisionService.divide(5, 2));
  }

  @Test
  void divide_positive_by_negative() {
    assertEquals(-3.0, divisionService.divide(9, -3));
  }

  @Test
  void divide_two_negatives() {
    assertEquals(3.0, divisionService.divide(-9, -3));
  }

  @Test
  void divide_by_zero_throws_exception() {
    ArithmeticException ex = assertThrows(ArithmeticException.class, () -> divisionService.divide(5, 0));
    assertEquals("Division by zero is not allowed", ex.getMessage());
  }

  @Test
  void divide_zero_by_number() {
    assertEquals(0.0, divisionService.divide(0, 5));
  }
}