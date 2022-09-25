package Examine_0506;

import java.util.Scanner;

public class P04_CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupOne = 0;
        int groupTwo = 0;
        int groupThree = 0;
        double totalEatenFood = 0;

        int cats = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= cats; i++) {
            int eatenFood = Integer.parseInt(scanner.nextLine());
            totalEatenFood += eatenFood;

            if (eatenFood < 200) {
                groupOne++;
            } else if (eatenFood < 300) {
                groupTwo++;
            } else {
                groupThree++;
            }
        }
        double eatenFoodKg = totalEatenFood / 1000;
        System.out.printf("Group 1: %d cats.%n", groupOne);
        System.out.printf("Group 2: %d cats.%n", groupTwo);
        System.out.printf("Group 3: %d cats.%n", groupThree);
        System.out.printf("Price for food per day: %.2f lv.", eatenFoodKg * 12.45);
    }
}
