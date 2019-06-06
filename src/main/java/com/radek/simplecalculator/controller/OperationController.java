package com.radek.simplecalculator.controller;

import com.radek.simplecalculator.domain.OperationModel;
import com.radek.simplecalculator.service.CalculationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class OperationController {

    OperationModel operationModel = new OperationModel();

    private static final String CALCULATOR_VALUE = "/calculator";
    private static final String CALCULATOR_RETURN = "calculator";
    private static final String OPERATION_MODEL_VALUE = "operationModel";
    private static final String OUTCOME_VALUE = "outcome";


    private final CalculationService calculationService;

    public OperationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @RequestMapping(CALCULATOR_VALUE)
    public String getCalculator(Model model) {
        model.addAttribute(OPERATION_MODEL_VALUE, operationModel);
        return CALCULATOR_RETURN;
    }

    @PostMapping(value = CALCULATOR_VALUE, params = "addition")
    public String addition(@ModelAttribute(OPERATION_MODEL_VALUE) OperationModel operationModel, Model model) {
        model.addAttribute(OUTCOME_VALUE, calculationService.addition(operationModel));
        return CALCULATOR_RETURN;
    }

    @PostMapping(value = CALCULATOR_VALUE, params = "subtraction")
    public String subtraction(@ModelAttribute(OPERATION_MODEL_VALUE) OperationModel operationModel, Model model){
        model.addAttribute(OUTCOME_VALUE, calculationService.subtraction(operationModel));
        return CALCULATOR_RETURN;
    }

    @PostMapping(value = CALCULATOR_VALUE, params = "division")
    public String division(@ModelAttribute(OPERATION_MODEL_VALUE) OperationModel operationModel, Model model){
        model.addAttribute(OUTCOME_VALUE, calculationService.division(operationModel));
        return CALCULATOR_RETURN;
    }

    @PostMapping(value = CALCULATOR_VALUE, params = "multiplication")
    public String multiplication(@ModelAttribute(OPERATION_MODEL_VALUE) OperationModel operationModel, Model model){
        model.addAttribute(OUTCOME_VALUE, calculationService.multiplication(operationModel));
        return CALCULATOR_RETURN;
    }

    @PostMapping(value = CALCULATOR_VALUE, params = "exponentiation")
    public String exponentiation(@ModelAttribute(OPERATION_MODEL_VALUE) OperationModel operationModel, Model model){
        model.addAttribute(OUTCOME_VALUE, calculationService.exponentiation(operationModel));
        return CALCULATOR_RETURN;
    }



}
