package WhileLoop;

import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;

        while (!number.equals("Stop")){
          int  currentNumber = Integer.parseInt(number);
          if (currentNumber < minNumber){
              minNumber = currentNumber;
          }
          number = scanner.nextLine();
        }
        System.out.printf("%d",minNumber);
    }
}
