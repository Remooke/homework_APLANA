package HOMEWORK13;

import java.util.Scanner;

public class Homework_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String str = scanner.nextLine();
        String[] mass = str.split(" ");
        boolean check = false;
        int counter = 0;
        System.out.println("Вывод только латинских слов:");
        for (int i = 0; i < mass.length; i++) {
            char[] chararray = mass[i].toCharArray();
            for (int j = 0; j < chararray.length; j++) {
                if (Character.UnicodeBlock.of(chararray[j]).equals(Character.UnicodeBlock.BASIC_LATIN)==true & Character.isDigit(chararray[j])==false){
                    check = true;
                }
                else {
                    check = false;
                    break;
                }

            }
            if (check == true) {
                counter++;
                System.out.println(mass[i]);
            }
        }
        System.out.println("Количество латинсков слов в предложении: " + counter);

    }
}

