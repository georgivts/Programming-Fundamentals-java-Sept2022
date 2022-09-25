package JavaConditionalStatementsExsersises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int time = hour * 60 + min + 15;
        int realHour = time / 60;
        int realMin = time % 60;
        if (realHour == 24) {
            realHour = 0;
        }
        System.out.printf("%d:%02d", realHour, realMin);

    }

}

