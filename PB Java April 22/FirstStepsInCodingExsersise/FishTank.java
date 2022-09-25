package FirstStepsInCodingExsersise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length= Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = width * length * high;
        double volumeL = volume * 0.001;
        double percentVolume = percent / 100;
        double volumeClear = volumeL * (1 - percentVolume);

        System.out.println(volumeClear);




    }
}
