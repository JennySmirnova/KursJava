package Task5_7;

/*
5. Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно.
7. Добавить обработку исключений в задание с ООП калькуляторам (например, исключение может возникнуть при делении на ноль)
*/
/**
 * @author Jenny Smirnova
 */

public class Main {
    public static void main(String[] args) {
        CalculatorInterface calc = new CalculatorInterface();
        calc.make();
    }
}
