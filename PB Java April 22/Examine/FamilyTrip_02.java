package Examine;

import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countOvernights = Integer.parseInt(scanner.nextLine());
        double priceOvernight = Double.parseDouble(scanner.nextLine());
        double extraExpenses = Double.parseDouble(scanner.nextLine());
        double sumVacation = 0;
        if ( countOvernights > 7 ){
            priceOvernight = priceOvernight * 0.95;
        }
         sumVacation = countOvernights * priceOvernight + (budget * extraExpenses / 100);
       if (budget >= sumVacation){
           System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget - sumVacation);
       }else {
           System.out.printf("%.2f leva needed.", sumVacation - budget);
       }



    }
}
