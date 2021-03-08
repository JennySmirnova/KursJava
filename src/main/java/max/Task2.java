package max;

/*Реализовать сложение дробных чисел, которые пользователь вводит в консоль. Использовать комментарии и JavaDoc при описании метода. Использовать форматирование при выводе результата в консоль. Полученный результат округлять до 4-х знаков после запятой.
 *Добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)*/
/**
 * @author Jenny Smirnova
 */

import java.util.*;

import static java.util.Scanner.*;

public class Task2 {
    public static void main(String[] args) {
/**
 @param s  result of calculation
  * @param A  the first number of the expression
 * @param B  the second number of the expression
 * @param c  operation to be performed with numbers
 */
        double s = 0;
        System.out.println("Введите число A: ");
        Scanner in =  new Scanner( System.in);
        double A =  in.nextDouble();
        System.out.println("Введите операцию (+, -, *, /) : ");
        char c = in.next().trim().charAt(0);
        System.out.println("Введите число B: ");
        double B =  in.nextDouble();

        if (c == '+')
        {
            s = A + B;
            System.out.printf(A +" + " +B + " = "+ "%.4f",s);
        }
        if (c == '-')
        {
            s = A - B;
            System.out.printf(A +" - " +B + " = "+ "%.4f",s);
        }
        if (c == '*')
        {
            s = A * B;
            System.out.printf(A +" * " +B + " = "+ "%.4f",s);
        }
        if (c == '/') {
            if ( B == 0) System.out.println("На 0 делить нельзя");
            else {
                s = A / B;
                System.out.printf(A +" / " +B + " = "+ "%.4f",s);
            }
        }
    }
}
