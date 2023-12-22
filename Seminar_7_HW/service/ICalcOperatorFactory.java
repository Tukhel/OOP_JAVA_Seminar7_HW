package Seminar_7_HW.service;

import Seminar_7_HW.model.CalcOperator;

public interface ICalcOperatorFactory {
    CalcOperator create(double arg);
}