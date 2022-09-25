package WhileLoopExsersise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());

        int daysCounter = 0;
        int daysSpend = 0;


        while (ownedMoney < vacationMoney) {
            if (daysSpend == 5) {
                break;
            }
            String comand = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daysCounter++;

            if (comand.equals("save")) {
                ownedMoney += money;
                daysSpend = 0;

            } else {
                daysSpend++;
                ownedMoney -= money;

                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
            }
        }
        if (daysSpend == 5) {
            System.out.println("You can't save the money.");
            System.out.println(daysSpend);
        } else {

            System.out.printf("You saved the money for %d days.", daysCounter);
        }
    }
}

