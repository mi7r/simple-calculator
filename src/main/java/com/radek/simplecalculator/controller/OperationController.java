package com.radek.simplecalculator.controller;

import com.radek.simplecalculator.service.CalculationService;
import lombok.extern.slf4j.Slf4j;
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

    @GetMapping("calc/{firstNumber}/add/{secondNumber}")
    public String addition(@PathVariable BigDecimal firstNumber, @PathVariable BigDecimal secondNumber) {
        return calculationService.addition(firstNumber, secondNumber).toString();
    }

    @GetMapping("calc/{firstNumber}/sub/{secondNumber}")
    public String subtraction(@PathVariable BigDecimal firstNumber, @PathVariable BigDecimal secondNumber) {
        return calculationService.subtraction(firstNumber, secondNumber).toString();
    }

    @GetMapping("calc/{firstNumber}/div/{secondNumber}")
    public String division(@PathVariable BigDecimal firstNumber, @PathVariable BigDecimal secondNumber) {
        return calculationService.division(firstNumber, secondNumber).toString();
    }

    @GetMapping("calc/{firstNumber}/mul/{secondNumber}")
    public String multiplication(@PathVariable BigDecimal firstNumber, @PathVariable BigDecimal secondNumber) {
        return calculationService.multiplication(firstNumber, secondNumber).toString();
    }

    @GetMapping("calc/{firstNumber}/exp}")
    public String exponentiation(@PathVariable BigDecimal firstNumber) {
        return calculationService.exponentiation(firstNumber).toString();
    }

    @GetMapping("calc/{firstNumber}/sub/{index}")
    public String customExponentiation(@PathVariable BigDecimal firstNumber, @PathVariable Integer index) {
        return calculationService.customExponentiation(firstNumber, index).toString();
    }


}
