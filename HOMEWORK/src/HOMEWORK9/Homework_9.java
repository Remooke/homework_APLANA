package HOMEWORK9;

import java.util.Scanner;

public class Homework_9 {


    public static void main(String[] args) {
        double summ=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();
        Double[] myArray = new Double[n];
        for (int i = 0; i < n; i++){
            System.out.println("Введите " + (i+1) + " число массива:");
            myArray[i] = scanner.nextDouble();
            summ += myArray[i];
        }
        double average = summ/n;

        for (int i = 0; i < n; i++){
                double result = myArray[i] * average;
                System.out.printf("%.3f x %.3f = %.3f\n", myArray[i],average,result );
            }

    }
}

