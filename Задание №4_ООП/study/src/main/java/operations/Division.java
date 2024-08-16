package operations;

public class Division extends Operation{
    public Division(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public void doOperation() {
        setResult (getOperand1() / getOperand2());
    }

    @Override
    public String toString() {
        return super.toString().replace ("operator","/");
    }
}
