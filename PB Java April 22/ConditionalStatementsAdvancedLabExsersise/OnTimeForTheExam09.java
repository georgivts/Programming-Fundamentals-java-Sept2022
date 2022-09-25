package ConditionalStatementsAdvancedLabExsersise;

import java.util.Scanner;

public class OnTimeForTheExam09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hoursArrive = Integer.parseInt(scanner.nextLine());
        int minArrive = Integer.parseInt(scanner.nextLine());

        int totalMinExam = hoursExam * 60 + minExam;
        int totalMinArrive = hoursArrive * 60 + minArrive;
        int result = totalMinExam - totalMinArrive;

        if ((totalMinArrive >= totalMinExam - 30) && (totalMinArrive <= totalMinExam)) {
            System.out.println("On time");
        } else if (totalMinArrive > totalMinExam) {
            System.out.println("Late");
        } else if (totalMinArrive < totalMinExam - 30) {
            System.out.println("Early");
        }

        int realHours = result / 60;
        int realMin = result % 60;
        if (result > 0) {
            if (result > 59) {
                if (realMin <= 9)
                    System.out.printf("%d:0%d hours before the start", realHours, realMin);
                else {
                    System.out.printf("%d:%d hours before the start", realHours, realMin);
                }
            } else {
                System.out.printf("%d minutes before the start", realMin);
            }
        } else if (result < 0) {
            if (result < -59) {
                if (Math.abs(realMin) <= 9) {
                    System.out.printf("%d:0%d hours after the start", Math.abs(realHours), Math.abs(realMin));
                } else {
                    System.out.printf("%d:%d hours after the start", Math.abs(realHours), Math.abs(realMin));
                }
            } else {
                System.out.printf("%d minutes after the start", Math.abs(realMin));
            }
        }


    }


}
