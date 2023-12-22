1. Создан интерфейс CalcOperator с обязательными методами sum, dev, multi, getResult для любого наследника.  
2. Реализован класс Calculator, который имплементирует CalcOperator и реализует необходимые методы.  
3. Создан интерфейс LoggerView с методом, который принимает сообщение.  
4. Реализован класс Logger, который импленетирует CalcOperator, реализует все необходимые методы. Создаёт экземпляр интерфейса LoggerView. Реализует вывод логов в консоль.
5. Создан класс ConsoleLogger, который имплементирует LoggerView, реализует метод, принимает сообщение + доп информация.   
6. Создан интерфейс ICalculatorView c методом run.
7. Реализован класс CalculatorView, который имплементирует ICalculatorView и реализует его метод взаимодействия с пользователем в косоле.
8. Создан интерфейс ICalcOperatorFactory, с методом creat класса CalcOperator и принимает аргумент.
9. Создан класс CalcOperatorFactory
10. Создан класс LogCalcOperatorFactory, который имплементирует ICalcOperatorFactory и реализует обязательный метод.
11. Создан класс LogCalculatorController, который создаёт экземпляры ICalcOperatorFactory и CalculatorView и реазлизует метод start.