package Task5_7;

import java.util.Scanner;

public class CalculatorInterface {
    private Calculator calculator;

    public CalculatorInterface() {
        calculator = new Calculator();
    }

    public void make() {

        try (Scanner scanner = new Scanner(System.in)) {
            CalculatorOperation currentOperation;
            while (true) {
                System.out.println("Введите тип операции (+,-,/,*) для вычисления. Для выхода нажмите q:");
                String operation = scanner.nextLine();
                currentOperation = CalculatorOperation.parse(operation);

                if (currentOperation == CalculatorOperation.Unknown)
                {
                    System.out.println("Операция введена некорректно!");
                } else if (currentOperation == CalculatorOperation.EXIT) {
                    break;
                }
                else
                {
                    boolean inputCorrect;
                    double a = 0;
                    double b = 0;
                    inputCorrect = false;
                    while (!inputCorrect) {
                        System.out.println("Введите первое число:");
                        String inputA = scanner.nextLine();
                        try {
                            a = Double.parseDouble(inputA);
                            inputCorrect = true;
                        } catch (NumberFormatException nex) {
                            System.out.println("Можно вводить только числа!");
                        }
                    }

                    inputCorrect = false;
                    while (!inputCorrect) {
                        System.out.println("Введите второе число:");
                        String inputB = scanner.nextLine();
                        try {
                            b = Double.parseDouble(inputB);
                        } catch (NumberFormatException nex) {
                            System.out.println("Можно вводить только числа!");
                            continue;
                        }
                        inputCorrect = true;
                    }

                    switch (currentOperation) {
                        case Addition:
                            System.out.printf("Сумма равна: %.4f\n", calculator.Addition(a, b));
                            break;
                        case Subtraction:
                            System.out.printf("Разность равна: %.4f\n", calculator.Subtraction(a, b));
                            break;
                        case Multiplication:
                            System.out.printf("Произведение равно: %.4f\n", calculator.Multiplication(a, b));
                            break;
                        case Division:
                            try {
                                double res = calculator.Division(a, b);
                                if (res == Double.POSITIVE_INFINITY ||
                                        res == Double.NEGATIVE_INFINITY)
                                    throw new ArithmeticException();
                            System.out.printf("Частное равно: %.4f\n", calculator.Division(a, b));
                            } catch (ArithmeticException ex) {
                                System.out.println("Делить на 0 нельзя");
                            }
                            break;
                    }
                }
            }
        }
    }
}
