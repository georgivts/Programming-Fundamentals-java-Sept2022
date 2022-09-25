package Examine2805;

import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = Double.parseDouble(scanner.nextLine());
        String services = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (services) {
            case "standard":
                if (weight < 1) {
                    price = 0.03 * distance;
                } else if (weight < 10) {
                    price = 0.05 * distance;
                } else if (weight < 40) {
                    price = 0.10 * distance;
                } else if (weight < 90) {
                    price = 0.15 * distance;
                } else {
                    price = 0.20 * distance;
                }
                break;
            case "express":
                if (weight < 1) {
                    price = 0.03 * distance + (0.80 * 0.03 * weight * distance);
                } else if (weight < 10) {
                    price = 0.05 * distance + (0.40 * 0.05 * weight * distance);
                } else if (weight < 40) {
                    price = 0.10 * distance + (0.05 * 0.10 * weight * distance);
                } else if (weight < 90) {
                    price = 0.15 * distance + (0.02 * 0.15 * weight * distance);
                } else {
                    price = 0.20 * distance + (0.01 * 0.20 * weight * distance);
                }
                break;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, price);
    }
}
