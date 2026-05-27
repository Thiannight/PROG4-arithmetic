package hei.school.arithmetic.endpoint.rest.controller;

import hei.school.arithmetic.model.OperationRequest;
import hei.school.arithmetic.model.OperationResult;
import hei.school.arithmetic.service.MultiplicationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arithmetic")
@AllArgsConstructor
public class MultiplicationController {

  private final MultiplicationService multiplicationService;

  @PostMapping("/multiplication")
  public OperationResult multiply(@RequestBody OperationRequest request) {
    return new OperationResult(multiplicationService.multiply(request.a(), request.b()));
  }
}