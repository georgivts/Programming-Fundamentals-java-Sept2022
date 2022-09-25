package ConditionalStatementsAdvancedLabExsersise;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double ticketPrice = 0;
        double transport = 0;
        if (people >= 1 && people <= 4) {
            transport = budget * 0.75;
            if (category.equals("Normal")) {
                ticketPrice = people * 249.99;
            } else {
                ticketPrice = people * 499.99;
            }

        } else if ((people >= 5) && (people <= 9)) {
            transport = budget * 0.60;
            if (category.equals("Normal")) {
                ticketPrice = people * 249.99;
            } else {
                ticketPrice = people * 499.99;
            }
        } else if ((people >= 10) && (people <= 24)) {
            transport = budget * 0.50;
            if (category.equals("Normal")) {
                ticketPrice = people * 249.99;
            } else {
                ticketPrice = people * 499.99;
            }
        } else if ((people >= 25) && (people <= 49)) {
            transport = budget * 0.40;
            if (category.equals("Normal")) {
                ticketPrice = people * 249.99;
            } else {
                ticketPrice = people * 499.99;
            }
        } else {
            transport = budget * 0.25;
            if (category.equals("Normal")) {
                ticketPrice = people * 249.99;
            } else {
                ticketPrice = people * 499.99;
            }
        }
        if (budget >= transport + ticketPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - transport - ticketPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - transport - ticketPrice));
        }
    }
}
