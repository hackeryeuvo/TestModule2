package Testmodule2;

public class Apple extends Food {
    int weight;

    public Apple(int id, String name, int price, int quantity, String color, int weight) {
        super(id, name, price, quantity, color);
        this.weight = weight;
    }

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", color='" + color + '\'' +
                '}';
    }
}
