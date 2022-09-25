package FirstStepsInCodingExsersise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plastic = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinnerPaint = Integer.parseInt(scanner.nextLine());
        int workingHours = Integer.parseInt(scanner.nextLine());

        double pricePaint = 14.50;
        double totalPricePaint = pricePaint * (paint * 0.1 + paint);
        double pricePaintThinner = 5.00 * thinnerPaint ;
        double pricePlastic = (plastic + 2) * 1.50;
        double bags = 0.40;
        double totalPriceMaterials = totalPricePaint + pricePaintThinner + pricePlastic + bags;
        double priceWorkers = (totalPriceMaterials * 0.3) * workingHours;
        double totalExpences = priceWorkers + totalPriceMaterials;


        System.out.println(totalExpences);







    }
}
