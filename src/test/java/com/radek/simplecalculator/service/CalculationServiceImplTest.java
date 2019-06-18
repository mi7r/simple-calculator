package com.radek.simplecalculator.service;

import com.radek.simplecalculator.domain.OperationModel;
import com.radek.simplecalculator.exception.ArithmeticException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CalculationServiceImplTest {

    @Mock
    CalculationService calculationService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        calculationService = new CalculationServiceImpl();
    }

    @Test
    public void additionTwoPlusTwoShouldReturnFour() {
        OperationModel model = new OperationModel();
        model.setFirstNumber(new BigDecimal(2));
        model.setSecondNumber(new BigDecimal(2));

        String result = calculationService.addition(model);
        assertEquals(Long.valueOf("4"), Long.valueOf(result));
    }

    @Test(expected = NullPointerException.class)
    public void additionWithEmptyFieldShouldThrowException() {
        OperationModel model = new OperationModel();
        model.setFirstNumber(new BigDecimal(2));

        calculationService.addition(model);
    }


    @Test
    public void subtractionFourMinusTwoShouldReturnTwo() {
        OperationModel model = new OperationModel();
        model.setFirstNumber(new BigDecimal(4));
        model.setSecondNumber(new BigDecimal(2));

        String result = calculationService.subtraction(model);
        assertEquals(Long.valueOf("2"), Long.valueOf(result));
    }

    @Test(expected = NullPointerException.class)
    public void subtractionWithEmptyFieldShouldThrowException() {
        OperationModel model = new OperationModel();
        model.setSecondNumber(new BigDecimal(4));

        calculationService.subtraction(model);
    }

    @Test
    public void divisionFourByTwoShouldReturnTwo() {
        OperationModel model = new OperationModel();
        model.setFirstNumber(new BigDecimal(4));
        model.setSecondNumber(new BigDecimal(2));

        String result = calculationService.division(model);
        assertEquals(Long.valueOf("2"), Long.valueOf(result));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionByZeroShouldThrowException() {
        OperationModel model = new OperationModel();
        model.setFirstNumber(new BigDecimal(4));
        model.setSecondNumber(new BigDecimal(0));

        calculationService.division(model);
    }

    @Test
    public void multiplicationTwoByTwoShouldReturnFour() {
        OperationModel model = new OperationModel();
        model.setFirstNumber(new BigDecimal(2));
        model.setSecondNumber(new BigDecimal(2));

        String result = calculationService.multiplication(model);
        assertEquals("4", result);
    }

    @Test
    public void exponentiationTwoPoweredByTwoShouldReturnFour() {
        OperationModel model = new OperationModel();
        model.setFirstNumber(new BigDecimal(2));
        model.setSecondNumber(new BigDecimal(2));

        String result = calculationService.exponentiation(model);
        assertEquals("4", result);
    }

    @Test
    public void squareRootFromFourShouldReturnTwo() {
        OperationModel model = new OperationModel();
        model.setSingleNumber(new BigDecimal(4));

        String result = calculationService.squareRoot(model);
        assertEquals("2.0", result);
    }

    @Test(expected = NullPointerException.class)
    public void squareRootWithEmptyFieldShouldThrowException() {
        OperationModel model = new OperationModel();

        String result = calculationService.squareRoot(model);
    }
}