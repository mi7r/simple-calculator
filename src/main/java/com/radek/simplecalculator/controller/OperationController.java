package com.radek.simplecalculator.controller;

import com.radek.simplecalculator.domain.OperationModel;
import com.radek.simplecalculator.service.CalculationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@Slf4j
@Controller
public class OperationController {

    OperationModel operationModel = new OperationModel();

    private static final String CALCULATOR_VALUE = "/calculator";
    private static final String CALCULATOR_RETURN = "calculator";


    private final CalculationService calculationService;

    public OperationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @RequestMapping(CALCULATOR_VALUE)
    public String getCalculator(Model model) {
        model.addAttribute("operationModel", operationModel);
        return CALCULATOR_RETURN;
    }

    @RequestMapping(value = CALCULATOR_VALUE, params = "addition", method = RequestMethod.POST)
    public String addition(@ModelAttribute("operationModel") OperationModel operationModel, Model model) {
        model.addAttribute("outcome", calculationService.addition(operationModel));
        log.info("addition result: " + calculationService.addition(operationModel));
        return CALCULATOR_RETURN;
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

    @GetMapping("/{firstNumber}/exp/{index}")
    public ResponseEntity<BigDecimal> exponentiation(@PathVariable BigDecimal firstNumber, @PathVariable Integer index) {
        return ResponseEntity.ok().body(calculationService.exponentiation(firstNumber, index));
    }


}
