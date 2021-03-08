package max;

/*1. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
*/
/**
 * @author Jenny Smirnova
 */
import java.util.*;

public class Task4_1 {
    public static void main(String[] args) {
        int n = 20;
        int arr[] =  new int[n];
        Scanner in =  new Scanner(System.in);
        for( int i = 0; i < n; i++){
            System.out.println("Введите любые числа от -10 до 10. \nВведите число "+ (i + 1) +": ");
            arr[i] = in.nextInt();
        }
        System.out.print("Введенный массив: ");
        for( int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        int max =  arr[0], min =  arr[0];
        int indexMax = 0, indexMin = 0;
        for( int i =  0; i < n; i++) {
            if (arr[i] > max){
                max = arr[i];
                indexMax = i;
            }
            if (arr[i] < min){
                min = arr[i];
                indexMin = i;
            }
        }
        System.out.println("\nМаксималное число max: " + max +"\nМинимальное число min: " + min);

        System.out.print("Полученный массив с учетом смены min и max чисел местами: \n");
        for( int i= 0; i < n; i++){
            if (arr[i] == max) {
                arr [i] = min;
                min = max;
                max = arr[i];
            }
            if (arr[i] == min) {
                arr[i] = max;
                max = min;
                min = arr [i];
            }
            System.out.print(arr[i]+" ");
        }
    }
}
