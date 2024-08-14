package sweets;

public class BubbleGum extends Sweet {
    private String size; // S, L, XXL

    public BubbleGum() {}

    public BubbleGum(String name, Double weight, Double price, String size) {
        super(name, weight, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "BubbleGum [" + super.toString() + ", size = " + size + "]";
    }
}
