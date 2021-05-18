package HOMEWORK6;

import java.util.Scanner;

public class Homework_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choise = scanner.nextInt();
        if (choise == 1)
        {
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - центнер, 4 - тонна");
            int mass = scanner.nextInt();
            System.out.println("Введите число");
            double N = scanner.nextDouble();
            switch (mass)
            {
                case 1:
                    System.out.println("Грамм: "+ N);
                    System.out.println("Килограмм: "+ N/1000);
                    System.out.println("Центнер: "+ N/100000);
                    System.out.println("Тонн: "+ N/1000000);
                    break;
                case 2:
                    System.out.println("Грамм: "+ N*1000);
                    System.out.println("Килограмм: "+ N);
                    System.out.println("Центнер: "+ N/100);
                    System.out.println("Тонн: "+ N/1000);
                    break;
                case 3:
                    System.out.println("Грамм: "+ N*100000);
                    System.out.println("Килограмм: "+ N*100);
                    System.out.println("Центнер: "+ N);
                    System.out.println("Тонн: "+ N/10);
                    break;
                case 4:
                    System.out.println("Грамм: "+ N*1000000);
                    System.out.println("Килограмм: "+ N*1000);
                    System.out.println("Центнер: "+ N*10);
                    System.out.println("Тонн: "+ N);
                default:System.out.println("Ошибка!Выберите корректную единицу измерения. Разрешено для ввода: 1 или 2 или 3 или 4");
                    break;
            }
        }
        else if (choise ==2)
        {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int distance = scanner.nextInt();
            System.out.println("Введите число");
            double N = scanner.nextDouble();
            switch (distance)
            {
                case 1:
                    System.out.println("Метр: "+ N);
                    System.out.println("Миля: "+ N*0.0006);
                    System.out.println("Ярд: "+ N*1.094);
                    System.out.println("Фут: "+ N*3.281);
                    break;
                case 2:
                    System.out.println("Метр: "+ N/0.0006);
                    System.out.println("Миля: "+ N);
                    System.out.println("Ярд: "+ N*1760);
                    System.out.println("Фут: "+ N*5280);
                    break;
                case 3:
                    System.out.println("Метр: "+ N/1.094);
                    System.out.println("Миля: "+ N/1760);
                    System.out.println("Ярд: "+ N);
                    System.out.println("Фут: "+ N*3);
                    break;
                case 4:
                    System.out.println("Метр: "+ N/3.281);
                    System.out.println("Миля: "+ N/5280);
                    System.out.println("Ярд: "+ N/3);
                    System.out.println("Фут: "+ N);
                    break;
                default:System.out.println("Ошибка!Выберите корректную единицу измерения. Разрешено для ввода только 1 или 2 или 3 или 4");
                break;
            }
        }
        else {System.out.println("Ошибка!Сделайте правильный выбор. Разрешено ввести только 1 или 2");}



    }
}
