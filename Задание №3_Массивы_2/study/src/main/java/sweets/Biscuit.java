package sweets;

public class Biscuit extends Sweet {
    private String taste; // Chocolate, Banana, Milk

    public Biscuit() {}

    public Biscuit(String name, Double weight, Double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Biscuit [" + super.toString() + ", taste = " + taste + "]";
    }
}
