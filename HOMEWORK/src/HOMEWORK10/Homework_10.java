package HOMEWORK10;

import java.util.Scanner;

public class Homework_10 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк массива:");
        int y = scanner.nextInt();
        System.out.println("Введите количество столбцов массива:");
        int x = scanner.nextInt();
        int[][] myArray = new int[y][x];
        for (int i =0; i < y; i++)
        {
            for (int j =0; j < x; j++)
            {
                System.out.println("Введите [" + i + "][" + j + "] элемент матрицы" );
                myArray[i][j] = scanner.nextInt();
            }
        }
        for (int j =0; j < x; j++)
        {
            System.out.println(myArray[0][j] + " x 3 = " + myArray[0][j]*3);
        }

    }
}
