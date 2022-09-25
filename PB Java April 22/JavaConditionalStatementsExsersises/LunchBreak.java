package JavaConditionalStatementsExsersises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int timeMovie = Integer.parseInt(scanner.nextLine());
        int launchBreak = Integer.parseInt(scanner.nextLine());

        double launchTime = launchBreak / 8.00;
        double timeForRest = launchBreak / 4.00;
        double freeTime = launchBreak - launchTime - timeForRest;
        if (freeTime >= timeMovie) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(freeTime - timeMovie));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(timeMovie - freeTime));
        }

    }
}
