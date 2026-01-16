package model;

public class Ribbon implements BouquetItem {
    private String type;
    private double price;

    public Ribbon(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() { return type; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Ribbon{" + type + ", price=" + price + "}";
    }
}
