package ForLoopExsersise;

import java.util.Scanner;

public class CleverLily04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int birthdayMoney = 0;
        int birthdayGift = 0;
        int brother = 0;
        int sumMoney = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                if (i == 2) {
                    birthdayMoney = 10;
                } else {
                    birthdayMoney += 10 * i / 2;
                }

                brother++;
            } else {
                birthdayGift++;
            }
        }
        sumMoney = birthdayMoney + (birthdayGift * toyPrice) - brother;
        if (sumMoney >= washMachine) {
            System.out.printf("Yes! %.2f", sumMoney - washMachine);
        } else {
            System.out.printf("No! %.2f", washMachine - sumMoney);
        }
    }
}
