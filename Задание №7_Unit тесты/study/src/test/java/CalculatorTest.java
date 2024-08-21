import operations.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Addition addition = new Addition(3.0, 5.0);
        addition.doOperation();
        double result = addition.getResult();
        assertEquals(8.0, result);
        String additionString = addition.toString();
        assertEquals("3.0 + 5.0 = 8,0000", additionString);
    }

    @Test
    public void testSubtraction() {
        Substraction subtraction = new Substraction(10.0, 4.0);
        subtraction.doOperation();
        double result = subtraction.getResult();
        assertEquals(6.0, result);
        String subtractionString = subtraction.toString();
        assertEquals("10.0 - 4.0 = 6,0000", subtractionString);
    }

    @Test
    public void testMultiplication() {
        Multiplication multiplication = new Multiplication(6.0, 3.0);
        multiplication.doOperation();
        double result = multiplication.getResult();
        assertEquals(18.0, result);
        String multiplicationString = multiplication.toString();
        assertEquals("6.0 * 3.0 = 18,0000", multiplicationString);
    }

    @Test
    public void testDivision() throws OperationException {
        Division division = new Division(10.0, 2.0);
        division.doOperation();
        double result = division.getResult();
        assertEquals(5.0, result);
        String divisionString = division.toString();
        assertEquals("10.0 / 2.0 = 5,0000", divisionString);
    }

    @Test
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        Division division = new Division(10.0, 0.0);
        assertThrows (DivisionOnZeroException.class, () -> {
            division.doOperation();
        });
    }
}
