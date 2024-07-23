package by.tms.lesson15_30.collections.tasks.task1;

/*
    Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3, 4, 4, 5".
    Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
    При решении использовать коллекции.
*/

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TaskTreeSet {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Input a number: ");
            num = sc.nextInt();
            if (num < 0) {
                break;
            }
            treeSet.add(num);
        }
        for (Integer integer : treeSet) {
            System.out.println(integer);
        }
    }
}
