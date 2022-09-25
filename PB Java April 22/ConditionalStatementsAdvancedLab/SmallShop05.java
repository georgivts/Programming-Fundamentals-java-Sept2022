package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class SmallShop05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());

        if ("Sofia".equals(city)) {
            if (("coffee".equals(product))) {
                System.out.println(count * 0.50);
            } else if (("water".equals(product))) {
                System.out.println(count * 0.80);
            } else if ("peanuts".equals(product)) {
                System.out.println(count * 1.60);
            } else if ("beer".equals(product)) {
                System.out.println(count * 1.20);
            } else if ("sweets".equals(product)) {
                System.out.println(count * 1.45);
            }
        }
        if ("Plovdiv".equals(city)) {
            if (("coffee".equals(product))) {
                System.out.println(count * 0.40);
            } else if (("water".equals(product))) {
                System.out.println(count * 0.70);
            } else if ("peanuts".equals(product)) {
                System.out.println(count * 1.50);
            } else if ("beer".equals(product)) {
                System.out.println(count * 1.15);
            } else if ("sweets".equals(product)) {
                System.out.println(count * 1.30);
            }
        }
        if ("Varna".equals(city)) {
            if (("coffee".equals(product))) {
                System.out.println(count * 0.45);
            } else if (("water".equals(product))) {
                System.out.println(count * 0.70);
            } else if ("peanuts".equals(product)) {
                System.out.println(count * 1.55);
            } else if ("beer".equals(product)) {
                System.out.println(count * 1.10);
            } else if ("sweets".equals(product)) {
                System.out.println(count * 1.35);
            }
        }
    }

}