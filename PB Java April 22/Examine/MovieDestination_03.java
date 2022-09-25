package Examine;

import java.util.Scanner;

public class MovieDestination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;

        switch (destination) {
            case "Dubai":
                if (season.equals("Winter")) {
                    totalSum = 45000 * days * 0.70;

                } else {
                    totalSum = 40000 * days * 0.70;
                }
                break;
            case "Sofia":
                if (season.equals("Winter")) {
                    totalSum = 17000 * days * 1.25;
                } else {
                    totalSum = 12500 * days * 1.25;
                }
                break;
            case "London":
                if (season.equals("Winter")) {
                    totalSum = 24000 * days;
                } else {
                    totalSum = 20250 * days;
                }
                break;
        }
        if (budget >= totalSum){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - totalSum);
        }else {
            System.out.printf("The director needs %.2f leva more!", totalSum - budget);
        }
    }
}
