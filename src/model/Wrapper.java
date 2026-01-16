package model;
public class Wrapper implements BouquetItem {
    private String type;
    private double price;

    public Wrapper(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() { return type; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Wrapper{" + type + ", price=" + price + "}";
    }
}



