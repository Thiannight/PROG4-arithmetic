package hei.school.arithmetic.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AdditionServiceTest {

  @InjectMocks private AdditionService additionService;

  @Test
  void add_two_positive_numbers() {
    assertEquals(5.0, additionService.add(2, 3));
  }

  @Test
  void add_positive_and_negative() {
    assertEquals(-1.0, additionService.add(2, -3));
  }

  @Test
  void add_two_negatives() {
    assertEquals(-5.0, additionService.add(-2, -3));
  }

  @Test
  void add_with_zero() {
    assertEquals(7.0, additionService.add(7, 0));
  }

  @Test
  void add_decimals() {
    assertEquals(0.3, additionService.add(0.1, 0.2), 1e-9);
  }
}
