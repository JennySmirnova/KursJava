package max;

/*1. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания
2. Поиск максимального элемента в массиве. Для начала задать массив слов.Размерность массива произвольна, задается в консоли. После чего в консоли вводятся слова в количестве равном заданной длине массива. В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
3. Программа должна выполнять одно из заданий на выбор.
Если в консоли ввести 1 - запустится выполнение калькулятора, если 2 - поиск максимального слова в массиве.
*/
/**
 * @author Jenny Smirnova
 */
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите номер задачи: (1-калькулятор, 2-строковый массив): ");
        Scanner in =  new Scanner( System.in);
        double task =  in.nextDouble();
        if (task == 1)
        {
            Calculation ();
        }
        if (task == 2)
        {
            stringArray ();
        }

    }
    public static void Calculation () {
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
    public static void stringArray () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        String arr[] = new String[size];
        in.nextLine();
        for (int i = 0; i < size; i++) {
            System.out.print("Введите слово " + (i + 1) + ": ");
            arr[i] = in.nextLine();
        }
        System.out.print("Введенный массив слов: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        int wordLength[] = new int[size];

        for (int i = 0; i < size; i++) {
            wordLength[i] = arr[i].length();
        }
        System.out.print("\nДлина слов: ");

        for (int i = 0; i < size; i++) {
            System.out.print(wordLength[i] + " ");
        }
        int max = wordLength[0];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (wordLength[i] > max) {
                max = wordLength[i];
                index = i;
            }
        }
        System.out.print("\nСамое длинное слово: " + arr[index]);
    }
}
