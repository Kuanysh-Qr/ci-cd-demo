package app;

import model.*;
import service.BouquetService;

public class Main {
    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet();

        bouquet.addFlower(new Rose(1200, 2, 45));
        bouquet.addFlower(new Tulip(700, 1, 30));
        bouquet.addFlower(new Lily(1500, 3, 50));
        bouquet.addFlower(new Rose(1100, 1, 40));

        bouquet.addAccessory(new Wrapper("Крафт-упаковка", 500));
        bouquet.addAccessory(new Ribbon("Красная лента", 300));

        BouquetService service = new BouquetService();

        System.out.println("=== Букет до сортировки ===");
        bouquet.printBouquet();

        System.out.println("\nСтоимость букета: " + service.calculateTotalPrice(bouquet) + " тг");

        System.out.println("\n=== Сортировка цветов по свежести ===");
        service.sortFlowersByFreshness(bouquet);
        bouquet.printBouquet();

        System.out.println("\n=== Поиск цветов по длине стебля (35..50 см) ===");
        var foundFlowers = service.findFlowersByStemLength(bouquet, 35, 50);

        if (foundFlowers.isEmpty()) {
            System.out.println("Цветы с заданной длиной стебля не найдены.");
        } else {
            System.out.println("Найденные цветы:");
            for (var f : foundFlowers) {
                System.out.println("  " + f);
            }
        }
    }
}
