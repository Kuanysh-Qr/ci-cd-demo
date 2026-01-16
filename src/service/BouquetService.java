package service;


import model.Bouquet;
import model.BouquetItem;
import model.Flower;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BouquetService {

    public double calculateTotalPrice(Bouquet bouquet) {
        double sum = 0;

        for (Flower flower : bouquet.getFlowers()) {
            sum += flower.getPrice();
        }

        for (BouquetItem item : bouquet.getAccessories()) {
            sum += item.getPrice();
        }

        return sum;
    }

    public void sortFlowersByFreshness(Bouquet bouquet) {
        bouquet.getFlowers().sort(Comparator.comparingInt(Flower::getFreshnessDays));
    }

    public List<Flower> findFlowersByStemLength(Bouquet bouquet, int min, int max) {
        List<Flower> result = new ArrayList<>(); // 3) Поиск цветков по длине

        for (Flower flower : bouquet.getFlowers()) {
            int stem = flower.getStemLength();
            if (stem >= min && stem <= max) {
                result.add(flower);
            }
        }

        return result;
    }
}

