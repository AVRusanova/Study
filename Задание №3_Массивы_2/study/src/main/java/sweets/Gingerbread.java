package sweets;

public class Gingerbread extends Sweet {

    private String theme; // christmas, easter, birthday

    public Gingerbread() {}

    public Gingerbread(String name, Double weight, Double price, String theme) {
        super(name, weight, price);
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Gingerbread [" + super.toString() + ", theme = " + theme + "]";
    }
}
