package sweets;

public class Toffee extends Sweet {
    private String hardness; // soft, medium, hard

    public Toffee() {}

    public Toffee(String name, Double weight, Double price, String hardness) {
        super(name, weight, price);
        this.hardness = hardness;
    }

    public String getHardness() {
        return hardness;
    }

    public void setHardness(String hardness) {
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return "Toffee [" + super.toString() + ", hardness = " + hardness + "]";
    }
}
