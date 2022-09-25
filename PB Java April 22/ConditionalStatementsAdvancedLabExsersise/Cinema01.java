package ConditionalStatementsAdvancedLabExsersise;

import java.util.Scanner;

public class Cinema01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeProject = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;
        int totalSeats = rows * columns;

        switch (typeProject) {
            case "Premiere":
                ticketPrice = 12.00;
                break;
            case "Normal":
                ticketPrice = 7.50;
                break;
            case "Discount":
                ticketPrice = 5.00;
                break;

        }
        double income = ticketPrice * totalSeats;
        System.out.printf("%.2f leva", income);
    }
}
