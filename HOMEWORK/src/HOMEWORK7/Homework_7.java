package HOMEWORK7;

import java.util.Scanner;

public class Homework_7 {


    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int z = 7;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Введите " + (i+1) + " число массива:");
            myArray[i] = scanner.nextInt();
            if (myArray[i] == x || myArray[i]==y || myArray[i] ==z){
                System.out.println("Данное значение имеется в константах ");
            }
        }
        }
    }

    
