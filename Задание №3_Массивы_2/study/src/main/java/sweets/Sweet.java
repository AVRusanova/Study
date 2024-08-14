package sweets;

public abstract class Sweet {
    private String name;
    private Double weight; // в кг
    private Double price; // в руб

    public Sweet() {}

    public Sweet(String name, Double weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        price = price;
    }

    @Override
    public String toString() {
        return "name = " + name + ", weight = " + weight + ", price = " + price + "";
    }
}
