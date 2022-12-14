package com.barsegyan_inna_java;

import java.util.Scanner;

public class TestTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив чисел точно так, как указано в примере. Пример: 1,2,3");
        String input = scanner.nextLine();
        String[] strNums = input.split(",");
        for (String strNum : strNums) {
            int number = Integer.parseInt(strNum);
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
