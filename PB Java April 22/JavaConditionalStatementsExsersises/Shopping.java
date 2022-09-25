package JavaConditionalStatementsExsersises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int video = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double sumVideo = video * 250;
        double sumCpu = sumVideo * 0.35 * cpu;
        double sumRam = sumVideo * 0.10 * ram;
        double totalPrice = sumVideo + sumCpu + sumRam;

        if (video > cpu) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        }
        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);

        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(totalPrice - budget));
        }
    }
}
