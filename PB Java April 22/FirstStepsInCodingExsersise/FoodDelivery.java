package FirstStepsInCodingExsersise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegansMenu = Integer.parseInt(scanner.nextLine());

        double chickenMenuPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.40;
        double vegansMenuPrice = vegansMenu * 8.15;
        double delivery = 2.50;
        double price = chickenMenuPrice + fishMenuPrice + vegansMenuPrice;
        double dessert = price * 20 / 100;
        double totalPrice = price + dessert + delivery;
        System.out.println(totalPrice);


    }
}
