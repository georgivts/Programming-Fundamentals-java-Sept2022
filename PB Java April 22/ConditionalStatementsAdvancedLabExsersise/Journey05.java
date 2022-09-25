package ConditionalStatementsAdvancedLabExsersise;

import java.util.Scanner;

public class Journey05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;

        if (budget <= 100) {
            if (season.equals("summer")) {
                price = budget * 0.30;
                System.out.printf("Somewhere in Bulgaria %n");
                System.out.printf("Camp - %.2f", price);
            } else if (season.equals("winter")) {
                price = budget * 0.70;
                System.out.printf("Somewhere in Bulgaria %n");
                System.out.printf("Hotel - %.2f", price);
            }

        } else if (budget <= 1000) {
            if (season.equals("summer")) {
                price = budget * 0.40;
                System.out.printf("Somewhere in Balkans %n");
                System.out.printf("Camp - %.2f", price);
            } else if (season.equals("winter")) {
                price = budget * 0.80;
                System.out.printf("Somewhere in Balkans %n");
                System.out.printf("Hotel - %.2f", price);
            }
        } else {
            price = budget * 0.90;
            System.out.printf("Somewhere in Europe %n");
            System.out.printf("Hotel - %.2f", price);
        }
    }
}
