package com.barsegyan_inna_java;

import java.util.Scanner;

public class TestTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String userName = scanner.nextLine();
        if (userName.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
