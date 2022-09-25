package Examine_0506;

import java.util.Scanner;

public class P01_MiningRig {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int videocard = Integer.parseInt(scanner.nextLine());
        int adapter = Integer.parseInt(scanner.nextLine());
        double consumption = Double.parseDouble(scanner.nextLine());
        double income = Double.parseDouble(scanner.nextLine());

        int totalVideocardPrice = videocard * 13;
        int adapterPrice = adapter * 13;
        int totalSum = totalVideocardPrice + adapterPrice + 1000;
        double profit = (income - consumption) * 13;
        double days = totalSum / profit;

        System.out.printf("%d%n%.0f", totalSum, Math.ceil(days));


    }
}