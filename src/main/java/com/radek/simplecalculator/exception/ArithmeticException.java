package com.radek.simplecalculator.exception;

public class ArithmeticException extends RuntimeException {

    public ArithmeticException() {
    }

    public ArithmeticException(String s) {
        super(s);
    }

    public ArithmeticException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
