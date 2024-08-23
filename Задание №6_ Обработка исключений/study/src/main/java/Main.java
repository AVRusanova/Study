import operations.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author ARusanova
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("КАЛЬКУЛЯТОР");
        System.out.print("Введите первое число: ");
        Double number1, number2;
        try {
            number1 = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            number2 = scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Неправильно введено число!");
            return;
        }
        System.out.print("Выберите операцию ('+' - сложение, '-' - вычитание, '*' - умножение, '/' - деление): ");
        String operand = scanner.next();
        Operation operation;
        switch (operand) {
            case "+":
                operation = new Addition(number1, number2);
                break; // сумма
            case "-":
                operation = new Substraction(number1, number2);
                break; // разность
            case "*":
                operation = new Multiplication(number1, number2);
                break; // прозведение
            case "/":
                operation = new Division(number1, number2);
                break; // деление
            default:
                System.err.println("Неверная операция!");
                return;
        }
        try {
            operation.doOperation();
            System.out.println(operation);
        }
        catch (OperationException e) {
            System.out.println("Ошибка выполнения операции.\nПричина: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
