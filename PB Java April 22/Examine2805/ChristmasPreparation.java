package Examine2805;

import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countRollsPaper = Integer.parseInt(scanner.nextLine());
        int countFabricRolls = Integer.parseInt(scanner.nextLine());
        double glueLitre = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

       // double wrappingPaper = 5.80;
       // double rollsFabric = 7.20;
       // double glue = 1.20;
        double priceRollsPaper = countRollsPaper * 5.80;
        double priceRollsFabric = countFabricRolls * 7.20;
        double priceGlue = glueLitre * 1.20;
        double totalSum = priceGlue + priceRollsFabric + priceRollsPaper;
        double totalSumWithDiscount =totalSum - (totalSum * discount/100);
        System.out.printf("%.3f", totalSumWithDiscount);

    }
}
