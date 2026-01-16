package model;

public abstract class Flower {
    private String type;
    private double price;
    private int freshnessDays;
    private int stemLength;

    protected Flower(String type, double price, int freshnessDays, int stemLength) {
        this.type = type;
        this.price = price;
        this.freshnessDays = freshnessDays;
        this.stemLength = stemLength;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getPrice() { return price; }
    public int getFreshnessDays() { return freshnessDays; }
    public int getStemLength() { return stemLength; }

    @Override
    public String toString() {
        return type + " {price=" + price +
                ", freshnessDays=" + freshnessDays +
                ", stem=" + stemLength + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return Double.compare(flower.price, price) == 0 &&
                freshnessDays == flower.freshnessDays &&
                stemLength == flower.stemLength &&
                type.equals(flower.type);
    }
}
