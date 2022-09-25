package ConditionalStatementsAdvancedLabExsersise;

import java.util.Scanner;

public class HotelRoom07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double priceStudio = 0;
        double priceApartment = 0;
        switch (month) {
            case "May":
            case "October":
                priceStudio = 50;
                priceApartment = 65;
                if (count > 14) {
                    priceStudio = 50 - 50 * 0.30;
                    priceApartment = 65 - 65 * 0.10;
                } else if (count > 7) {
                    priceStudio = 50 - 50 * 0.05;
                }
                break;
            case "June":
            case "September":
                priceStudio = 75.20;
                priceApartment = 68.70;
                if (count > 14) {
                    priceStudio = 75.20 - 75.20 * 0.20;
                    priceApartment = 68.70 - 68.70 * 0.10;
                }
                break;
            case "July":
            case "August":
                priceStudio = 76;
                priceApartment = 77;
                if (count > 14) {
                    priceApartment = 77 - 77 * 0.10;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", priceApartment * count);
        System.out.printf("Studio: %.2f lv.", priceStudio * count);
    }
}
