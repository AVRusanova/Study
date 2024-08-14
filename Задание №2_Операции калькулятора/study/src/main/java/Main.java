/**
 * @author ARusanova
 */

import java.util.Scanner;

public class Main {
    /**
     * Задание 2: Калькулятор и поиск самого длинного слова
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите режим работы\n" +
                "1 - калькулятор\n" +
                "2 - поиск максимального слова\n" +
                "Выш выбор: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("КАЛЬКУЛЯТОР");
            System.out.print("Введите первое число: ");
            Double number1 = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            Double number2 = scanner.nextDouble();
            System.out.print("Выберите операцию ('+' - сложение, '-' - вычитание, '*' - умножение, '/' - деление): ");
            String operand = scanner.next();
            if (operand.equals("/") && number2 == 0d) {
                System.err.println("Деление на 0!");
                return;
            }
            // Выисление результата
            Double result = 0.0;
            switch (operand) {
                case "+":
                    result = number1 + number2;
                    break; // сумма
                case "-":
                    result = number1 - number2;
                    break; // разность
                case "*":
                    result = number1 * number2;
                    break; // прозведение
                case "/":
                    result = number1 / number2;
                    break; // деление
                default:
                    System.err.println("Неверная операция!");
                    return;
            }
            // вывод результата с 4-мя знаками после запятой
            System.out.printf("Результат: %.4f", result);
        } else if (choice == 2) {
            System.out.println("ПОИСК МАКСИМАЛЬНОГО СЛОВА");
            System.out.println("Введите количество слов: ");
            int amount = scanner.nextInt();
            boolean needNote = false;
            String maxWord = "", nextWord = "";
            int maxLength = 0;
            for (int i = 0; i < amount; i++) {
                System.out.printf("Cлово %d: ", i + 1);
                nextWord = scanner.next();
                int currentLength = nextWord.length();
                if (currentLength == maxLength) {
                    needNote = true;
                }
                else if (currentLength > maxLength) {
                    maxWord = nextWord;
                    maxLength = currentLength;
                }
            }
            System.out.printf("Самое длинное слово: " + maxWord);
            if (needNote)
                System.out.println("\nПримечание: выведено первое слово из нескольких слов максимальной длины");
        } else
            System.err.println("Неверный выбор!");
        scanner.close();
    }
}
