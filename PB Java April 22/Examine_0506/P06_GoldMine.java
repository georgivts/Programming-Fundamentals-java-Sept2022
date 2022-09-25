package Examine_0506;

import java.util.Scanner;

public class P06_GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumRealGold = 0;
        double avgRealGold = 0;
        double expectedGold = 0;

        int location = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= location; i++) {
             expectedGold = Double.parseDouble(scanner.nextLine());
            int daysOnThatLocation = Integer.parseInt(scanner.nextLine());
             if (i!=1){
                 sumRealGold = 0;
                 avgRealGold = 0;
             }

            for (int j = 1; j <= daysOnThatLocation; j++) {
               double realGold = Double.parseDouble(scanner.nextLine());
                sumRealGold += realGold;

            }
            avgRealGold = sumRealGold / daysOnThatLocation;
            if (avgRealGold >= expectedGold) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", avgRealGold);
            } else {
                System.out.printf("You need %.2f gold.%n", expectedGold - avgRealGold);
            }

        }

    }
}
