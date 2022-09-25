package ConditionalStatementsAdvancedLabExsersise;

import java.util.Scanner;

public class SkiTrip09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysVacations = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String evaluation = scanner.nextLine();
        int overnight = daysVacations - 1;
        double price = 0;
        double totalPrice = 0;
        switch (room) {
            case "room for one person": {

                price = 18 * overnight;
            }
            break;
            case "apartment": {
                if (overnight < 10) {
                    price = 25 * overnight - (25 * overnight * 0.3);
                } else if (overnight <= 15) {
                    price = 25 * overnight - (25 * overnight * 0.35);
                } else {
                    price = 25 * overnight - (25 * overnight * 0.5);
                }
            }
            break;
            case "president apartment": {
                if (overnight < 10) {
                    price = 35 * overnight - (35 * overnight * 0.10);
                } else if (overnight <= 15) {
                    price = 35 * overnight - (35 * overnight * 0.15);
                } else {
                    price = 35 * overnight - (35 * overnight * 0.20);
                }
            }
            break;
        }
        if (evaluation.equals("positive")) {
            totalPrice = price + (price * 0.25);
        } else if (evaluation.equals("negative")) {
            totalPrice = price - (price * 0.10);
        }
        System.out.printf("%.2f", totalPrice);

    }
}
