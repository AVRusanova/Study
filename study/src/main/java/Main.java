/**
 * @author ARusanova
 */
import java.util.Scanner;

public class Main {
    /** Cложение дробных чисел */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое дробное число: ");
        Double x = scanner.nextDouble();
        System.out.print("Введите второе дробное число: ");
        Double y = scanner.nextDouble();
        Double result = x + y; // вычисление суммы
        // вывод результата с 4-мя знаками после запятой
        System.out.printf("Результат: %.4f", result);
        scanner.close();
    }
}
