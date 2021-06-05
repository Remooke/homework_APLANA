package HOMEWORK11;

import java.util.Scanner;

public class Homework_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        String str1 = scanner.nextLine();
        System.out.println("Введите второе число:");
        int a = scanner.nextInt();
        System.out.println("Наибольшее из двух чисел: " + Math.max(a,Integer.parseInt(str1)));
        double min = Math.min(Double.parseDouble(str1),a);
        System.out.println("Наименьшее из двух чисел с конвертацией в тип double: " + min);
    }
}
