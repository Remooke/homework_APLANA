package FINALHOMEWORK1;

import java.util.Scanner;

public class FinalHomework_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Курс доллара: ");
        double currency = scanner.nextDouble();
        System.out.print("Количество рублей: ");
        double rouble = scanner.nextDouble();
        System.out.print("Итого: ");
        double dollar = rouble/currency;
        System.out.printf("%.2f",dollar);
        System.out.println(" долларов");
    }
}
