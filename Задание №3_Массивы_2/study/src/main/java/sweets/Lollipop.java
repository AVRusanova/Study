package sweets;

public class Lollipop extends Sweet {
    private String fruit; // apple, strawberry, mango

    public Lollipop() {}

    public Lollipop(String name, Double weight, Double price, String fruit) {
        super(name, weight, price);
        this.fruit = fruit;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return "Lollipop [" + super.toString() + ", fruit = " + fruit + "]";
    }

}
