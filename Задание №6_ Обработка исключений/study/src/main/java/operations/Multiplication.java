package operations;

public class Multiplication extends Operation {
    public Multiplication(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    public void doOperation() {
        setResult(this.getOperand1() * this.getOperand2());
    }

    @Override
    public String toString() {
        return super.toString().replace("operator", "*");
    }
}
