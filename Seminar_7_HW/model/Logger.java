package Seminar_7_HW.model;

import Seminar_7_HW.view.LoggerView;

public class Logger implements CalcOperator {
    private CalcOperator calculator;
    private LoggerView logger;

    public Logger(CalcOperator calculator, LoggerView logger){
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public CalcOperator sum(double arg) {
        double firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора = %f. Начало вызова метода sum с параметром %f", firstArg, arg));
        CalcOperator result = calculator.sum(arg);
        logger.log(String.format("Вызова метода sum произошел"));
        return result;
    }

    @Override
    public CalcOperator multi(double arg) {
        double firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора = %f. Начало вызова метода multi с параметром %f", firstArg, arg));
        CalcOperator result = calculator.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public CalcOperator div(double arg) {
        double firstArg = calculator.getResult();
        logger.log(String.format("Первое значение калькулятора = %f. Начало вызова метода div с параметром %f", firstArg, arg));
        CalcOperator result = calculator.div(arg);
        logger.log(String.format("Вызова метода div произошел"));
        return result;
    }

    @Override
    public double getResult() {
        double result = calculator.getResult();
        logger.log(String.format("Получение результата %f", result));
        return result;
    }
}