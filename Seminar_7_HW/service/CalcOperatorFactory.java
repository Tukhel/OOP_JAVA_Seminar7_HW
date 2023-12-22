package Seminar_7_HW.service;

import Seminar_7_HW.model.CalcOperator;
import Seminar_7_HW.model.Calculator;

public class CalcOperatorFactory implements ICalcOperatorFactory {
    public CalcOperator create(double arg) {
        return new Calculator(arg);
    }
}