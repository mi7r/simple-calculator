package com.radek.simplecalculator.service;

import com.radek.simplecalculator.domain.OperationModel;

public interface CalculationService {

    String addition (OperationModel model);

    String subtraction(OperationModel model);

    String division(OperationModel model);

    String multiplication(OperationModel model);

    String exponentiation(OperationModel model);

    String squareRoot(OperationModel model);
}
