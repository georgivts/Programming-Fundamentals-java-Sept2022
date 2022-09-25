package Examine_0506;

import java.util.Scanner;

public class P05_ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int underSixteen = 0;
        int overSixteen = 0;

        String comand = scanner.nextLine();
        while (!comand.equals("Christmas")) {
            int age = Integer.parseInt(comand);
            if (age <= 16) {
                underSixteen++;
            } else {
                overSixteen++;
            }
            comand = scanner.nextLine();
        }
        System.out.printf("Number of adults: %d%n", overSixteen);
        System.out.printf("Number of kids: %d%n", underSixteen);
        System.out.printf("Money for toys: %d%n",underSixteen *5);
        System.out.printf("Money for sweaters: %d%n",overSixteen *15);
    }
}
