package Seminar_7_HW.model;

public class Calculator implements CalcOperator {
    private double arg;

    public Calculator(double arg) {
        this.arg = arg;
    }

    @Override
    public CalcOperator sum(double arg) {
        this.arg += arg;
        return this;
    }

    @Override
    public CalcOperator multi(double arg) {
        this.arg *= arg;
        return this;
    }

    @Override
    public CalcOperator div(double arg) {
        this.arg /= arg;
        return this;
    }

    @Override
    public double getResult() {
        return arg;
    }
}