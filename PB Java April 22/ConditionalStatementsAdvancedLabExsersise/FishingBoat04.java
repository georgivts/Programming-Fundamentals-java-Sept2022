package ConditionalStatementsAdvancedLabExsersise;

import java.util.Scanner;

public class FishingBoat04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishman = Integer.parseInt(scanner.nextLine());
        double boatPrice = 0;
        double discount = 0.00;
        double discountFishmen = 0;

        switch (season) {
            case "Spring" -> boatPrice = 3000;
            case "Summer" -> boatPrice = 4200;
            case "Autumn" -> boatPrice = 4200;
            case "Winter" -> boatPrice = 2600;
        }
        if (fishman <= 6) {
            boatPrice = boatPrice - boatPrice * 0.10;
        } else if (fishman <= 11) {
            boatPrice = boatPrice - boatPrice * 0.15;
        } else {
            boatPrice = boatPrice - boatPrice * 0.25;
        }
        if ((season.equals("Spring")) || (season.equals("Summer")) || (season.equals("Winter"))) {
            if (fishman % 2 == 0) {
                boatPrice = boatPrice - boatPrice * 0.05;
            }
        }
        if (budget >= boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - boatPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", boatPrice - budget);
        }
    }

}
