package operations;

public class DivisionOnZeroException extends OperationException {
    public DivisionOnZeroException () {
        super ("Деление на ноль!");
    }
}
