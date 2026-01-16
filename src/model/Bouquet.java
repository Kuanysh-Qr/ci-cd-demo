package model;

import java.util.*;

public class Bouquet {
    private List<Flower> flowers = new ArrayList<>();
    private List<BouquetItem> accessories = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addAccessory(BouquetItem accessory) {
        accessories.add(accessory);
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Flower f : flowers) sum += f.getPrice();
        for (BouquetItem a : accessories) sum += a.getPrice();
        return sum;
    }

    public void sortFlowersByFreshness() {
        flowers.sort(Comparator.comparingInt(Flower::getFreshnessDays));
    }

    public List<Flower> findFlowersByStemLength(int min, int max) {
        List<Flower> result = new ArrayList<>();
        for (Flower f : flowers) {
            if (f.getStemLength() >= min && f.getStemLength() <= max) {
                result.add(f);
            }
        }
        return result;
    }

    public void printBouquet() {
        System.out.println("Flowers:");
        for (Flower f : flowers) System.out.println("  " + f);

        System.out.println("Accessories:");
        for (BouquetItem a : accessories) System.out.println("  " + a);

        System.out.println("Total price: " + getTotalPrice());
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public List<BouquetItem> getAccessories() {
        return accessories;
    }

}

