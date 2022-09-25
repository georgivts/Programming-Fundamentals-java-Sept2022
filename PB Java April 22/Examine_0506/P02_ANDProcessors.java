package Examine_0506;

import java.util.Scanner;

public class P02_ANDProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cpuCount = Integer.parseInt(scanner.nextLine());
        int peopleCount = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());

        double sumWorkingHours = peopleCount * workingDays * 8;
        double cpuMade = Math.floor(sumWorkingHours / 3);
        if (cpuMade >= cpuCount){
            System.out.printf("Profit: -> %.2f BGN", (cpuMade - cpuCount)* 110.10);
        }else {
            System.out.printf("Losses: -> %.2f BGN", (cpuCount - cpuMade) * 110.10);
        }

    }
}
