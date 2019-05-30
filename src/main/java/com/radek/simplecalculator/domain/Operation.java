package com.radek.simplecalculator.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Operation {

    BigDecimal firstNumber;
    BigDecimal secondNumber;
    BigDecimal result;
}
