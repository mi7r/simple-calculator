package com.radek.simplecalculator.service;

import java.math.BigDecimal;

public interface CalculationService {

    BigDecimal addition (BigDecimal firstNumber, BigDecimal secondNumber);

    BigDecimal subtraction(BigDecimal firstNumber,BigDecimal secondNumber);

    BigDecimal division(BigDecimal firstNumber,BigDecimal secondNumber);

    BigDecimal multiplication(BigDecimal firstNumber,BigDecimal secondNumber);

    BigDecimal exponentiation(BigDecimal firstNumber);

    BigDecimal customExponentiation(BigDecimal firstNumber, Integer index);
}
