package Examine2805;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double realSales = 0;
        double realRates = 0;
        double realR = 0;
        double realS = 0;
        double avgRealR = 0;
        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            int raiting = currentNumber % 10;
            int sales = currentNumber / 10;


            if (raiting == 2){
                realSales = 0;
            } else if (raiting == 3){
                realSales = sales * 0.50;
            } else if (raiting == 4) {
                realSales = sales * 0.70;
            } else if (raiting == 5) {
                realSales = sales * 0.85;
            } else if (raiting == 6) {
                realSales = sales;
            }
            realR += raiting;
            avgRealR = realR / n;
            realS += realSales;
        }
        System.out.printf("%.2f%n",realS);
        System.out.printf("%.2f",avgRealR);
    }
}
