package ru.geekbrains.lesson1.home_work;

import java.util.List;

/*Напишите программу, которая использует Stream API для обработки списка чисел.
Программа должна вывести на экран среднее значение всех четных чисел в списке.*/
public class TaskOne {
    public static void main(String[] args) {

        List<Integer> integerList = List.of(3, 2, 0, -1, 5, 2, 9, 4);
        double average = integerList.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("Среднее значение четных чисел: " + average);
    }
}
