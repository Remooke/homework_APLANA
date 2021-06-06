package FINALHOMEWORK3;

import java.util.Scanner;

public class FinalHomework_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n = scanner.nextInt();
        int[] result = new int[n];
        String [] str1 = new String[n];
        boolean check = false;
        int counter = 0;
        int max = 0;
        String maxStr=null;
        for (int i = 0; i < n; i++) {
            System.out.println("Строка " + (i+1) + ": ");
            String str = scanner.next();
            str1 [i] = str;
            char[] charStr = str.toCharArray();
            for (int k = 0; k < charStr.length; k++) {
                check = !(str.substring(k+1).contains(String.valueOf(charStr[k])));
                if (check) {counter=++counter;}
            }
            result[i]=counter;
            counter=0;
            for(int j=0;j<result.length;j++){
                if(max<result[j]){
                    max=result[j];
                    maxStr=str1[i];
                }
            }
        }
        System.out.println("Ответ: " + maxStr);
    }
}
