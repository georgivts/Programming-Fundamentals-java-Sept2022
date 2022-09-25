package ForLoopExsersise;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int sumPoints = 0;
        double winning = 0;
        for (int i = 1; i <= tournaments; i++) {
            String result = scanner.nextLine();
            if (result.equals("W")) {
                sumPoints += 2000;
                winning++;
            } else if (result.equals("SF")) {
                sumPoints += 720;
            } else if (result.equals("F")) {
                sumPoints += 1200;
            }
        }
        int averagePoints = sumPoints / tournaments;
        double percent = (winning / tournaments) * 100;
        System.out.printf("Final points: %d%n", sumPoints + startingPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%", percent);


    }
}
