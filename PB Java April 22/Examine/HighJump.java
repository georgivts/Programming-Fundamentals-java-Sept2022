package Examine;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int targetJump = Integer.parseInt(scanner.nextLine());
        double currentJump = 0;
        int currentTarget = targetJump - 30;
        int numberTry = 0;
        int failedTry = 0;
        boolean falseStart = false;

        while (currentTarget <= targetJump) {

            currentJump = Double.parseDouble(scanner.nextLine());
            if (currentJump > currentTarget) {
                currentTarget += 5;
                numberTry++;
                failedTry = 0;
            } else {
                failedTry++;
                numberTry++;
            }
            if (failedTry == 3) {
                falseStart = true;
                break;
            }
        }
        if (falseStart){
            System.out.printf("Tihomir failed at %dcm after %d jumps.", currentTarget, numberTry);
        }else {
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", targetJump, numberTry);
        }



    }
}
