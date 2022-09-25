package FirstStepsInCoding;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double pricePerSquareMeters = 7.61;
        double price = area * pricePerSquareMeters;
        double discount = price * 18/100;
        double totalPrice = price - discount;
        System.out.printf("The final price is: %f lv. %n", totalPrice);
        System.out.printf("The discount is: %f lv.", discount);

        }
    }

