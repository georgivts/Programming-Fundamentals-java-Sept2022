package ForLoopExsersise;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());
        int medic = 7;
        int sumPacient = 0;
        int pacient = 0;
        int treatedPatients = 0;
        for (int i = 1; i <= period; i++) {
            pacient = Integer.parseInt(scanner.nextLine());
            sumPacient += pacient;
            if ((i % 3 == 0) && sumPacient > medic * i) {
                medic++;
            }
            if (pacient > medic){
                treatedPatients +=  medic;
            }else {
                treatedPatients += pacient;
            }

        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", sumPacient - treatedPatients);
    }

}






