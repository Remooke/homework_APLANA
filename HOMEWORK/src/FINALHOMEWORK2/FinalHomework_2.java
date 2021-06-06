package FINALHOMEWORK2;

import java.util.Scanner;

public class FinalHomework_2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ввод: ");
            String str = scanner.nextLine();
            char[] charArray = str.toCharArray();
            int x = str.indexOf('x');
            int result=0;
            int a = Character.getNumericValue(charArray[0]);
            int b = Character.getNumericValue(charArray[2]);
            int c = Character.getNumericValue(charArray[4]);

            if (charArray.length==5){
                if (charArray[1]=='+'){
                    switch (x) {
                        case (0):
                            result = c-b;
                            break;
                        case (2):
                            result = c-a;
                            break;
                        case (4):
                            result = a+b;
                            break;
                    }
                    System.out.println("Вывод: "+result);
                } else if (charArray[1]=='-') {
                    switch (x) {
                        case (0):
                            result = c+b;
                            break;
                        case (2):
                            result = a-c;
                            break;
                        case (4):
                            result = a-b;
                            break;
                    }
                    System.out.println("Вывод: "+result);
                } else {
                    System.out.println("ОШИБКА!Введите корректный математический знак");
                }
            } else {
                System.out.println("ОШИБКА! Должно быть 5 символов");
            }
    }
}
