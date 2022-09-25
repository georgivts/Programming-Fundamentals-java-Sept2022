package JavaConditionalStatementsExsersises;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int stunt = Integer.parseInt(scanner.nextLine());
        double suits = Double.parseDouble(scanner.nextLine());
        double discount = 0;
        double price = 0;
        double decor = budget * 0.10;
        if (stunt > 150) {
            discount = suits - (suits * 0.10);
            price = stunt * discount;
        } else {
            price = stunt * suits;
        }

        double totalPrice = budget - price - decor;
        double neededMoney = Math.abs(budget - price - decor);


        if (totalPrice >= 0) {
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.2f leva left.", totalPrice);

        } else {
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more.", neededMoney);
        }

    }
}
