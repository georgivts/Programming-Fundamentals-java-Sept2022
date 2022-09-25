package ConditionalStatementsAdvancedLabExsersise;

import java.util.Scanner;

public class NewHouse03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        //  double priceRoses = 5.00;
        //   double priceDahlias = 3.80;
        //  double priceTulips = 2.80;
        //  double priceNarcissus = 3.00;
        //  double priceGladiolus = 2.50;

        if (flower.equals("Roses")) {
            if (countFlowers > 80) {
                totalPrice = countFlowers * 5 - countFlowers * 5 * 0.10;

            } else {
                totalPrice = countFlowers * 5;
            }
        }
        if (flower.equals("Dahlias")) {
            if (countFlowers > 90) {
                totalPrice = countFlowers * 3.80 - countFlowers * 3.80 * 0.15;

            } else {
                totalPrice = countFlowers * 3.80;
            }
        }
        if (flower.equals("Tulips")) {
            if (countFlowers > 80) {
                totalPrice = countFlowers * 2.80 - countFlowers * 2.80 * 0.15;

            } else {
                totalPrice = countFlowers * 2.80;
            }
        }
        if (flower.equals("Narcissus")) {
            if (countFlowers < 120) {
                totalPrice = countFlowers * 3 + countFlowers * 3 * 0.15;

            } else {
                totalPrice = countFlowers * 3;
            }
        }
        if (flower.equals("Gladiolus")) {
            if (countFlowers < 80) {
                totalPrice = countFlowers * 2.50 + countFlowers * 2.50 * 0.20;

            } else {
                totalPrice = countFlowers * 2.50;
            }
        }
        if (totalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers, flower, Math.abs(budget - totalPrice));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(budget - totalPrice));
        }

    }
}