package Seminar_7_HW.view;

public class ConsoleLogger implements LoggerView{

    @Override
    public void log(String message) {
        System.out.println("LOG:" + message);
    }
}