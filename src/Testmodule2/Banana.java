package Testmodule2;

public class Banana extends Food {
    int size;

    public Banana(int id, String name, int price, int quantity, String color, int size) {
        super(id, name, price, quantity, color);
        this.size = size;
    }

    public Banana(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "size=" + size +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", color='" + color + '\'' +
                '}';
    }
}
