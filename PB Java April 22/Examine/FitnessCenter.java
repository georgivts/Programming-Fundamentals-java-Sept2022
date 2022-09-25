package Examine;

import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        int backTraining = 0;
        int chestTraining = 0;
        int legsTraining = 0;
        int absTraining = 0;
        int proteinShake = 0;
        int proteinBar = 0;

        for (int i = 1; i <= countPeople; i++) {
            String activity = scanner.nextLine();
            if (activity.equals("Back")) {
                backTraining++;
            } else if (activity.equals("Chest")) {
                chestTraining++;
            } else if (activity.equals("Legs")) {
                legsTraining++;
            } else if (activity.equals("Abs")) {
                absTraining++;
            } else if (activity.equals("Protein shake")) {
                proteinShake++;
            } else if (activity.equals("Protein bar")) {
                proteinBar++;
            }
        }
        double workOutPeople = backTraining + chestTraining + legsTraining + absTraining;
        double protein = proteinShake + proteinBar;
        System.out.printf("%d - back%n", backTraining);
        System.out.printf("%d - chest%n", chestTraining);
        System.out.printf("%d - legs%n", legsTraining);
        System.out.printf("%d - abs%n", absTraining);
        System.out.printf("%d - protein shake%n", proteinShake);
        System.out.printf("%d - protein bar%n", proteinBar);
        System.out.printf("%.2f%% - work out%n", workOutPeople / countPeople * 100);
        System.out.printf("%.2f%% - protein", protein / countPeople * 100);
    }
}

