package Task4_2;

public class Candy extends Sweets {

    String type;
    public Candy(String name, int weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString () {
        return "Конфеты " + super.toString() + ", вид: " + type;
    }
}
