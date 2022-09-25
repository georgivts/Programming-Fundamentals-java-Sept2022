package ForLoopExsersise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int maxNumber = Integer.MIN_VALUE;
int sum = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (maxNumber < currentNumber){
                maxNumber = currentNumber;
            }
            sum+= currentNumber;
        }
        int sumWithoutMaxNum = sum - maxNumber;
        if (sumWithoutMaxNum == maxNumber){
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNumber);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(maxNumber - sumWithoutMaxNum));
        }
    }

}
