package JavaConditionalStatementsExsersises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trip = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = puzzle * 2.60;
        double dollPrice = doll * 3.00;
        double bearPrice = bear * 4.10;
        double minionPrice = minion * 8.20;
        double truckPrice = truck * 2.00;
        double sumPrice = puzzlePrice + dollPrice + bearPrice + minionPrice + truckPrice;
        int countToys = puzzle + doll + truck + bear + minion;
        double discount = 0;


        if (countToys >= 50) {
            discount = sumPrice * 0.25;


        }
        double rent = (sumPrice - discount) * 0.10;
        double totalPrice = sumPrice - discount - rent;
        double neededMoney = Math.abs(totalPrice - trip);


        if (totalPrice >= trip){
            System.out.printf("Yes! %.2f lv left.", neededMoney);
        }
        else {
            System.out.printf("Not enough money! %.2f lv needed.", neededMoney);}

    }
}
