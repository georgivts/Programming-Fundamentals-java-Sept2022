package Examine2805;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double partyPrice = Double.parseDouble(scanner.nextLine());
        int message = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int keyHolder = Integer.parseInt(scanner.nextLine());
        int cartoon = Integer.parseInt(scanner.nextLine());
        int surprise = Integer.parseInt(scanner.nextLine());
        double priceMessages = message * 0.60;
        double priceRoses = rose * 7.20;
        double priceKeyHolders = keyHolder * 3.60;
        double priceCartoons = cartoon * 18.20;
        double priceSurprises = surprise * 22.00;
        double totalPrice = priceMessages + priceRoses + priceCartoons + priceKeyHolders + priceSurprises;
        if (message + rose + keyHolder + cartoon + surprise >= 25) {
            totalPrice = totalPrice - totalPrice * 0.35;
        }
        double totalPriceWithExpanses = totalPrice - totalPrice * 0.10;
        if (partyPrice < totalPriceWithExpanses) {
            System.out.printf("Yes! %.2f lv left.", totalPriceWithExpanses - partyPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(partyPrice - totalPriceWithExpanses));
        }
    }


}

