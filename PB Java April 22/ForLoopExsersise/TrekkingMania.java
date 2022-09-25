package ForLoopExsersise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        double total = 0;
        double musala = 0;
        double monblan = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;

        //•	Група до 5 човека – изкачват Мусала
        //•	Група от 6 до 12 човека – изкачват Монблан
        //•	Група от 13 до 25 човека – изкачват Килиманджаро
        //•	Група от 26 до 40 човека –  изкачват К2
        //•	Група от 41 или повече човека – изкачват Еверест
        for (int i = 1; i <= groups; i++) {
            int peopleInGroups = Integer.parseInt(scanner.nextLine());
            total += peopleInGroups;
            if (peopleInGroups <= 5) {
                musala += peopleInGroups;
            } else if (peopleInGroups <= 12) {
                monblan += peopleInGroups;
            } else if (peopleInGroups <= 25) {
                kilimandjaro += peopleInGroups;
            } else if (peopleInGroups <= 40) {
                k2 += peopleInGroups;
            } else {
                everest += peopleInGroups;
            }
        }
        musala = musala / total * 100;
        monblan = monblan / total * 100;
        kilimandjaro = kilimandjaro / total * 100;
        k2 = k2 / total * 100;
        everest = everest / total * 100;
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%", musala, monblan, kilimandjaro, k2, everest);
    }
}
