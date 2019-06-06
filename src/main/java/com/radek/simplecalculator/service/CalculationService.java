package com.radek.simplecalculator.service;

import com.radek.simplecalculator.domain.OperationModel;

import java.math.BigDecimal;

public interface CalculationService {

    String addition (OperationModel model);

    BigDecimal subtraction(BigDecimal firstNumber,BigDecimal secondNumber);

    BigDecimal division(BigDecimal firstNumber,BigDecimal secondNumber);

    BigDecimal multiplication(BigDecimal firstNumber,BigDecimal secondNumber);

    BigDecimal exponentiation(BigDecimal firstNumber, Integer index);
}
