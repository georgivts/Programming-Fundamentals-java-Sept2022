package Examine;

import java.util.Scanner;

public class PoolDay2019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        double entranceFee = Double.parseDouble(scanner.nextLine());
        double shezlong = Double.parseDouble(scanner.nextLine());
        double umbrella = Double.parseDouble(scanner.nextLine());

        double sumEntranceFee = countPeople * entranceFee;
        double shezlongNeeded = Math.ceil(countPeople * 0.75);
        double umbrellaNeeded = Math.ceil(countPeople / 2.00);
        double totalPrice = sumEntranceFee + (shezlongNeeded *shezlong) + (umbrellaNeeded * umbrella);
        System.out.printf("%.2f lv.", totalPrice);
    }
}
