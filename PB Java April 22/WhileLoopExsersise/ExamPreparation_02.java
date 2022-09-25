package WhileLoopExsersise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPoorGrades = Integer.parseInt(scanner.nextLine());

        int failedTimes = 0;
        int solvedTask = 0;
        double sumGrades = 0;
        String lastTask = "";
        boolean win = false;

        while (failedTimes < countPoorGrades) {
            String nameTask = scanner.nextLine();
            if (nameTask.equals("Enough")) {
                win = true;
                break;
            }
            int currentGrade = Integer.parseInt(scanner.nextLine());
            if (currentGrade <= 4) {
                failedTimes++;
            }
            sumGrades += currentGrade;
            solvedTask++;
            lastTask = nameTask;

        }
        if (win) {
            System.out.printf("Average score: %.2f%n", sumGrades / solvedTask);
            System.out.printf("Number of problems: %d%n", solvedTask);
            System.out.printf("Last problem: %s", lastTask);
        }
        else {
            System.out.printf("You need a break, %d poor grades.",failedTimes);
        }


    }
}
