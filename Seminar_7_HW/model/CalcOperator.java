package Seminar_7_HW.model;

public interface CalcOperator {
    CalcOperator sum(double arg);
    CalcOperator multi(double arg);
    CalcOperator div(double arg);
    double getResult();
}