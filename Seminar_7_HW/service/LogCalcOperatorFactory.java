package Seminar_7_HW.service;

import Seminar_7_HW.model.CalcOperator;
import Seminar_7_HW.model.Calculator;
import Seminar_7_HW.model.Logger;
import Seminar_7_HW.view.LoggerView;

public class LogCalcOperatorFactory implements ICalcOperatorFactory{
    private LoggerView logger;

    public LogCalcOperatorFactory(LoggerView logger){
        this.logger = logger;
    }
    @Override
    public CalcOperator create(double arg) {
        return new Logger(new Calculator(arg), logger);
    }
}