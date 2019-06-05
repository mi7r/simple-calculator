package com.radek.simplecalculator.service;

import com.radek.simplecalculator.exception.ArithmeticException;
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
        try {
            return firstNumber.divide(secondNumber, 4, BigDecimal.ROUND_CEILING);
        } catch (RuntimeException ex) {
            throw new ArithmeticException("You can not divide by zero");
        }
    }

    @Override
    public BigDecimal multiplication(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.multiply(secondNumber);
    }

    @Override
    public BigDecimal exponentiation(BigDecimal firstNumber, Integer index) {
        return firstNumber.pow(index);
    }
}
