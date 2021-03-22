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
        System.out.print("Массив случайных элементов:\n");
            for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int)(Math.random() * 21) - 10);
            System.out.print(arr[i]+" ");
        }

        int max =  -11, min =  11;
        int indexMax = 0, indexMin = 0;

        for( int i =  0; i < n; i++) {
            if (arr[i] < 0 && max< arr[i]){
                max = arr[i];
                indexMax = i;
            }
            if (arr[i] >0 && min> arr[i]) {
                min = arr[i];
                indexMin = i;
            }
        }
        System.out.println("\nМаксимальный отрицательный элемент: " + max +"\nМинимальный положительный элемент: " + min);

        System.out.print("Полученный массив с учетом смены min и max элементов местами: \n");
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
