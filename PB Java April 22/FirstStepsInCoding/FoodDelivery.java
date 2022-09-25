package FirstStepsInCoding;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());
        double dogFoodPrice = 2.50;
        double catFoodPrice = 4.00;
        double dogFoodPriceTotal = dogFood * 2.50;
        double catFoodPriceTotal = catFood * 4.00;
        double totalFoodPrice = dogFoodPriceTotal + catFoodPriceTotal;

        System.out.printf("%f lv.",totalFoodPrice);



    }
}
