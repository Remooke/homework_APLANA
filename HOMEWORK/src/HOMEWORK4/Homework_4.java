package HOMEWORK4;

import java.util.Scanner;

public class Homework_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double x = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double y = scanner.nextDouble();
        System.out.println("Введите третье число:");
        double z = scanner.nextDouble();
        double average = (x+y+z)/3;
        double a = average/2;
        double result = Math.floor(a);
        if (result > 3){
            System.out.println("Программа выполнена корректно");
        }
        else {
            System.out.println("Что-то не то");
        }
    }
}
