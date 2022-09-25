package ForLoopExsersise;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int priceLoad = 0;
        double sumLoad = 0;
        int busLoad = 0;
        int truckLoad = 0;
        int trainLoad = 0;
        for (int i = 1; i <= n; i++) {
            int load = Integer.parseInt(scanner.nextLine());
            if (load <= 3) {
                busLoad += load;
                priceLoad += 200 * load;
            } else if (load <= 11) {
                truckLoad += load;
                priceLoad += 175 * load;
            } else {
                trainLoad += load;
                priceLoad += 120 * load;
            }
            sumLoad += load;
        }
        System.out.printf("%.2f%n", priceLoad / sumLoad);
        System.out.printf("%.2f%%%n", busLoad / sumLoad * 100);
        System.out.printf("%.2f%%%n", truckLoad / sumLoad * 100);
        System.out.printf("%.2f%%%n", trainLoad / sumLoad * 100);
    }
}
