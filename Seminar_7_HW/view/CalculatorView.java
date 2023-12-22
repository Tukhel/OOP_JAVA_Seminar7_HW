package Seminar_7_HW.view;
import Seminar_7_HW.model.CalcOperator;
import Seminar_7_HW.service.ICalcOperatorFactory;

import java.util.Scanner;

public class CalculatorView implements ICalculatorView {
    private final ICalcOperatorFactory calcOperatorFactory;

    public CalculatorView(ICalcOperatorFactory calcOperatorFactory) {
        this.calcOperatorFactory = calcOperatorFactory;
    }

    @Override
    public void run() {
        while (true) {
            double argument = promptFloat("Введите первое число: ");
            CalcOperator calculator = calcOperatorFactory.create(argument);
            while (true) {
                String cmd = prompt("Введите оператор (+, *, /, =) : ");
                if (cmd.equals("+")) {
                    double arg = promptFloat("Введите второе число: ");
                    calculator.sum(arg);
                }
                if (cmd.equals("*")) {
                    double arg = promptFloat("Введите второе число: ");
                    calculator.multi(arg);
                }
                if (cmd.equals("/")) {
                    double arg = promptFloat(("Введите второе число: "));
                    while (arg == 0) {
                        System.out.println("Нельзя делить на ноль");
                        arg = promptFloat(("Введите второе число: "));
                    }
                    calculator.div(arg);
                }
                if (cmd.equals("=")) {
                    double result = calculator.getResult();
                    System.out.printf("Результат %f\n", result);
                    break;
                }
            }
            String cmd = prompt("Продолжить (Да/Нет)?");
            if (cmd.equalsIgnoreCase("Да")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptFloat(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Float.parseFloat(in.nextLine());
    }
}