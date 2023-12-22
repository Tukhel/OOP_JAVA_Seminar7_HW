package Seminar_7_HW;

import Seminar_7_HW.controller.LogCalculatorController;
import Seminar_7_HW.service.LogCalcOperatorFactory;
import Seminar_7_HW.view.CalculatorView;
import Seminar_7_HW.view.ConsoleLogger;

public class Main {
    public static void main(String[] args) {
        LogCalcOperatorFactory factory = new LogCalcOperatorFactory(new ConsoleLogger());
        LogCalculatorController controller = new LogCalculatorController(factory, new CalculatorView(factory));
        controller.start();
    }
}