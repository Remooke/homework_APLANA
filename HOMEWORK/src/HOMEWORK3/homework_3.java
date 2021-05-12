package HOMEWORK3;

import static java.lang.System.out;

/*
        Задайте массив из 5 любых целых чисел.
        Поменяйте местами первый и последний элемент в массиве.
        Вывести в консоль результат суммы первого и среднего элемента.
 */
public class homework_3 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5};
        int first = nums[0];
        int last = nums[nums.length-1];
        nums[nums.length-1] = first;
        nums[0] = last;
        int average = nums[(nums.length-1)/2];
        int summ = average + nums[0];
        System.out.printf("сумма первого и среднего элемента = %d", summ);
    }
}
