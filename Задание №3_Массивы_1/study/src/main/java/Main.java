/**
 * @author ARusanova
 */
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int intArray[];
        int sizeArray = 20;
        intArray = new int[sizeArray];

        // Заполнение массива случайными целыми числами от -10 до 10
        for (int i=0; i<sizeArray; i++) {
            intArray [i] = (int)(Math.random()*20)-10;
        }
        System.out.println("Массив случайных чисел: \n" + Arrays.toString(intArray));

        // Поиск максимального отрицательного и минимального положительного элементов массива
        int maxNegative = -11, minPositive = 11, maxNegativeIndex = -1, minPositiveIndex = -1;
        for (int i=0; i<sizeArray; i++) {
            int element = intArray[i];
            if (element < 0 && element > maxNegative) {
                maxNegative = element;
                maxNegativeIndex = i;
            }
            if (element > 0 && element < minPositive) {
                minPositive = element;
                minPositiveIndex = i;
            }
        }
        System.out.println("Максимальный отрицательный элемент массива: \n" + maxNegative + " (индекс " + maxNegativeIndex + ")");
        System.out.println("Минимальный положительный элемент массива: \n" + minPositive + " (индекс " + minPositiveIndex + ")");

        // обмен местами максимального отрицательного и минимального положительного элементов массива
        intArray[maxNegativeIndex] = minPositive;
        intArray[minPositiveIndex] = maxNegative;

        System.out.println("Массив после их обмена местами: \n" + Arrays.toString(intArray));
    }
}
