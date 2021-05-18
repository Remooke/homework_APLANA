package HOMEWORK5;

import java.util.Scanner;

public class Homework_5 {
    public static void main(String[] args) {
        double result  = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double b = scanner.nextDouble();
        System.out.println("Введите один из символов: +, -, * или /");
        String z = scanner.next();

        switch (z) {
            case "+": result = a+b;
                break;
            case "-": result = a-b;
                break;
            case "*": result = a*b;
                break;
            case "/": result = a/b;
                break;
        }
        System.out.println(result);

    }
}
