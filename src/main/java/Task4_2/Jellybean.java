package Task4_2;

public class Jellybean extends Sweets{

    String color;
    public Jellybean(String name, int weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString () {
        return "Мармелад " + super.toString() + ", цвет: " + color;
    }
}
