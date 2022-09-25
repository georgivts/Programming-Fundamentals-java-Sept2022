package Examine_0506;

import java.util.Scanner;

public class P03_ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        double priceHour = 0;
        double sumPrice = 0;

        switch (month) {
            case "march":
            case "april":
            case "may":
                if (dayTime.equals("day")) {
                    priceHour = 10.50;
                } else {
                    priceHour = 8.40;
                }
                break;
            case "june":
            case "july":
            case "august":
                if (dayTime.equals("day")) {
                    priceHour = 12.60;
                } else {
                    priceHour = 10.20;
                }
                break;
        }

        if (people >= 4) {
            priceHour = priceHour * 0.90;
        }
        if (hours >= 5) {
            priceHour = priceHour / 2;
        }
        sumPrice = priceHour * hours * people;
        System.out.printf("Price per person for one hour: %.2f%n", priceHour);
        System.out.printf("Total cost of the visit: %.2f", sumPrice);
    }
}
