package by.homework.hw1;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        System.out.println("Введите целое число: ");
        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();
        int num1 = 0;
        int num2 = 1;
        int sum = num1;
        System.out.println("Последователльность чисел Фибоначчи: ");
        System.out.printf("%d ", num1);
        if (!(number == num1)) {
            while (num2 <= number) {
                System.out.printf("%d ", num2);
                sum += num2;
                int num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
        }
        System.out.printf("\nСумма чисел последовательности равна: %d", sum);
    }
}