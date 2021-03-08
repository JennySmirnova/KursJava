package Task4_2;

public class Chocolate extends Sweets {
    String taste;
    public Chocolate(String name, int weight, double price, String taste) {
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
    public String toString () {
        return "Шоколад " + super.toString() + ", со вкусом " + taste;
    }
}
