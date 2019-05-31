package com.radek.simplecalculator.controller;

import com.radek.simplecalculator.service.CalculationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

@Slf4j
@Controller
public class OperationController {

    private final CalculationService calculationService;

    public OperationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping(value = "/{firstNumber}/add/{secondNumber}")
    public ResponseEntity<BigDecimal> addition(@PathVariable BigDecimal firstNumber, @PathVariable BigDecimal secondNumber) {
        return ResponseEntity.ok().body(calculationService.addition(firstNumber, secondNumber));
    }

    @GetMapping(value = "/{firstNumber}/sub/{secondNumber}")
    public ResponseEntity<BigDecimal> subtraction(@PathVariable BigDecimal firstNumber, @PathVariable BigDecimal secondNumber) {
        return ResponseEntity.ok().body(calculationService.subtraction(firstNumber, secondNumber));
    }

    @GetMapping("/{firstNumber}/div/{secondNumber}")
    public ResponseEntity<BigDecimal> division(@PathVariable BigDecimal firstNumber, @PathVariable BigDecimal secondNumber) {
        return ResponseEntity.ok().body(calculationService.division(firstNumber, secondNumber));
    }

    @GetMapping("/{firstNumber}/mul/{secondNumber}")
    public ResponseEntity<BigDecimal> multiplication(@PathVariable BigDecimal firstNumber, @PathVariable BigDecimal secondNumber) {
        return ResponseEntity.ok().body(calculationService.multiplication(firstNumber, secondNumber));
    }

    @GetMapping("/{firstNumber}/exp}")
    public ResponseEntity<BigDecimal> exponentiation(@PathVariable BigDecimal firstNumber) {
        return ResponseEntity.ok().body(calculationService.exponentiation(firstNumber));
    }

    @GetMapping("/{firstNumber}/exp/{index}")
    public ResponseEntity<BigDecimal> customExponentiation(@PathVariable BigDecimal firstNumber, @PathVariable Integer index) {
        return ResponseEntity.ok().body(calculationService.customExponentiation(firstNumber, index));
    }


}
