package operations;

public abstract class Operation {
    private double operand1;
    private double operand2;
    private double result;
    public Operation() {};
    public Operation(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public abstract void doOperation();

    @Override
    public String toString() {
        return getOperand1() + " operator " + getOperand2() + " = " + String.format("%.4f", getResult());
    }
}
