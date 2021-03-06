package com.radek.simplecalculator.service;

import com.radek.simplecalculator.domain.OperationModel;
import com.radek.simplecalculator.exception.ArithmeticException;
import org.springframework.stereotype.Service;

import java.math.MathContext;

@Service
public class CalculationServiceImpl implements CalculationService {
    @Override
    public String addition(OperationModel model) {
        return model.getFirstNumber().add(model.getSecondNumber()).toString();
    }

    @Override
    public String subtraction(OperationModel model) {
        return model.getFirstNumber().subtract(model.getSecondNumber()).toString();
    }

    @Override
    public String division(OperationModel model) {
        try {
            return model.getFirstNumber().divide(model.getSecondNumber(), MathContext.DECIMAL32).toString();
        } catch (RuntimeException ex) {
            throw new ArithmeticException("You can not divide by zero.");
        }
    }

    @Override
    public String multiplication(OperationModel model) {
        return model.getFirstNumber().multiply(model.getSecondNumber()).toString();
    }

    @Override
    public String exponentiation(OperationModel model) {
        return model.getFirstNumber().pow(model.getSecondNumber().intValue()).toString();
    }

    @Override
    public String squareRoot(OperationModel model) {
        return String.valueOf(Math.sqrt(model.getSingleNumber().doubleValue()));
    }
}
