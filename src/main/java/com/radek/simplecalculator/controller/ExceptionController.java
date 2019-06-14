package com.radek.simplecalculator.controller;

import com.radek.simplecalculator.exception.ArithmeticException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Object handleArithmeticException(ArithmeticException ex){
        log.error("Handling Arithmetic Exception: " + ex.getMessage());

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("error/divisionerror");
        modelAndView.addObject("exception", ex);

        return modelAndView;
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Object handleNullPointerException(NullPointerException ex){
        log.error("Handling Null Pointer Exception: " + ex.getMessage());


        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("error/emptyfielderror");
        modelAndView.addObject("exception", ex);

        return modelAndView;
    }
}
