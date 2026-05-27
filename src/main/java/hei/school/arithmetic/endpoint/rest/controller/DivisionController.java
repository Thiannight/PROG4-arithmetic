package hei.school.arithmetic.endpoint.rest.controller;

import hei.school.arithmetic.model.OperationRequest;
import hei.school.arithmetic.model.OperationResult;
import hei.school.arithmetic.service.DivisionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/arithmetic")
@AllArgsConstructor
public class DivisionController {

  private final DivisionService divisionService;

  @PostMapping("/division")
  public OperationResult divide(@RequestBody OperationRequest request) {
    try {
      return new OperationResult(divisionService.divide(request.a(), request.b()));
    } catch (ArithmeticException e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
  }
}