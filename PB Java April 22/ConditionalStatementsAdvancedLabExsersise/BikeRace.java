package ConditionalStatementsAdvancedLabExsersise;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorsBike = Integer.parseInt(scanner.nextLine());
        int seniorsBike = Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();
        double juniorsTax = 0;
        double seniorsTax = 0;
        double sumtax = 0;
        if (trace.equals("trail")){
            juniorsTax = 5.50;
            seniorsTax = 7;
        } else if (trace.equals("cross-country")) {
            juniorsTax = 8.0;
            seniorsTax = 9.50;
            if (juniorsBike + seniorsBike >= 50){
                juniorsTax = 8.0 - 8 * 0.25;
                seniorsTax = 9.50 - 9.50 * 0.25;
            }
        }else if (trace.equals("downhill")){
            juniorsTax = 12.25;
            seniorsTax = 13.75;
        }else if (trace.equals("road")){
            juniorsTax = 20;
            seniorsTax = 21.50;
        }

sumtax = juniorsTax * juniorsBike + seniorsTax * seniorsBike;
        System.out.printf("%.2f", sumtax - sumtax * 0.05);
    }

    }

