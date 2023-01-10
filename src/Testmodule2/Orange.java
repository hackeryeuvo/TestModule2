package Testmodule2;

public class Orange extends Food {
    String sweet;

    public Orange(int id, String name, int price, int quantity, String color, String sweet) {
        super(id, name, price, quantity, color);
        this.sweet = sweet;
    }

    public Orange(String sweet) {
        this.sweet = sweet;
    }

    public String getSweet() {
        return sweet;
    }

    public void setSweet(String sweet) {
        this.sweet = sweet;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "sweet='" + sweet + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", color='" + color + '\'' +
                '}';
    }
}
