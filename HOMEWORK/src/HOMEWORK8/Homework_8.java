package HOMEWORK8;

import java.util.Scanner;

public class Homework_8 {
    public static void main(String[] args) {
        int summ = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число:");
        int n = scanner.nextInt();
        if (n > 0) {
            int[] myArray = new int[n];
            for (int i = 0; i < n; i++) {
                myArray[i] = i + 1;
                if (myArray[i] % 2 != 0) {
                    summ += myArray[i];
                }
            }
            System.out.println("Сумма нечетных чисел от 1 до " + n + " равна " + summ);
        }
        else System.out.println("Ошибка. Число должно быть больше 0");
    }
}
