package FirstStepsInCodingExsersise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearTaxes = Integer.parseInt(scanner.nextLine());

        double sneakers = yearTaxes - (yearTaxes * 40/100);
        double equipment = sneakers - (sneakers * 20/100);
        double ball = equipment * 1/4;
        double accessories = ball * 1/5;
        double price = sneakers + equipment + ball + accessories + yearTaxes;
        System.out.println(price);



    }
}
