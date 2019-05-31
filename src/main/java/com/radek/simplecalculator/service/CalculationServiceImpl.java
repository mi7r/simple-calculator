package com.radek.simplecalculator.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculationServiceImpl implements CalculationService {
    @Override
    public BigDecimal addition(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.add(secondNumber);
    }

    @Override
    public BigDecimal subtraction(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.subtract(secondNumber);
    }

    @Override
    public BigDecimal division(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.divide(secondNumber, 4, BigDecimal.ROUND_CEILING);
    }

    @Override
    public BigDecimal multiplication(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.multiply(secondNumber);
    }

    @Override
    public BigDecimal exponentiation(BigDecimal firstNumber) {
        return firstNumber.pow(2);
    }

    @Override
    public BigDecimal customExponentiation(BigDecimal firstNumber, Integer index) {
        return firstNumber.pow(index);
    }
}
