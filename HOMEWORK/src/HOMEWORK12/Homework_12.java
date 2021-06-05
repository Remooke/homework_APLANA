package HOMEWORK12;

public class Homework_12 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        if(str.contains("Java") == true & str.startsWith("I like")== true & str.endsWith("!!!"))
            System.out.println(str.toUpperCase());
        String changer = str.replace('a','o');
        System.out.println(changer.substring(7,11));
    }
}
