package com.barsegyan_inna_java;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        Integer number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }
    }
}