package com.radek.simplecalculator.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class OperationModel {

    private String operation;
    private BigDecimal firstNumber;
    private BigDecimal secondNumber;
    private BigDecimal singleNumber;

    public OperationModel(BigDecimal firstNumber, BigDecimal secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public OperationModel(String operation) {
        this.operation = operation;
    }

    public OperationModel() {
    }
}
