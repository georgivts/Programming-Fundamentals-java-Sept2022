package Examine;

import java.util.Scanner;

public class FruitMarket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananaWeight = Double.parseDouble(scanner.nextLine());
        double orangeWeight = Double.parseDouble(scanner.nextLine());
        double raspberriesWeight = Double.parseDouble(scanner.nextLine());
        double strawberryWeight = Double.parseDouble(scanner.nextLine());

        double strawberryPriceSum = strawberryWeight * strawberryPrice;
        double raspberriesPrice = (strawberryPrice / 2) * raspberriesWeight;
        double orangePrice = (strawberryPrice / 2) * 0.6 * orangeWeight;
        double bananaPrice = (strawberryPrice / 2) * 0.2 * bananaWeight;

        double totalSum = strawberryPriceSum + raspberriesPrice + orangePrice + bananaPrice;
        System.out.printf("%.2f", totalSum);
    }
}
