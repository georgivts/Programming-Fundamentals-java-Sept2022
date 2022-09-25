package ForLoopExsersise;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                money -= 12000;
            } else {
                money -= 12000 + 50 *(18 + i - 1800);
            }
        }
        if (money >= 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",money);
        }else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
        }
    }
}
