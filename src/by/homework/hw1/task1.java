package by.homework.hw1;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        System.out.println("Введите целое трехзначное число:");
        Scanner inputData = new Scanner(System.in);
        int number = inputData.nextInt();
        // Сумма цифр трехзначного числа
        int digit1 = number % 10;
        int digit2 = number / 10 % 10;
        int digit3 = number / 100;
        int sum = digit1 + digit2 + digit3;
        System.out.printf("Сумма цифр числа равна: %d", sum);
    }
}