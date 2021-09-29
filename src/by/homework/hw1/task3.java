package by.homework.hw1;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberDay;
        int sumPrecipitation = 0;
        int maxPrecipitation = 0;
        System.out.println("Введите кол-во дней:");
        numberDay = scanner.nextInt();
        if (!(numberDay == 0)) {
            int temp;
            System.out.println("Введите кол-во осадков  каждый день:");
            for (int i = 1; i <= numberDay; i++) {
                System.out.printf("День %d:", i);
                temp = scanner.nextInt();
                sumPrecipitation += temp;
                if (maxPrecipitation < temp)
                    maxPrecipitation = temp;
            }
            System.out.printf("Количество дней: %d \n", numberDay);
            System.out.printf("Суммарное ко-во осадков: %d \n", sumPrecipitation);
            System.out.printf("Среднее ко-во осадков за период: %.1f \n", (sumPrecipitation * 1.0 / numberDay));
            System.out.printf("Максимальное дневное ко-во осадков: %d:\n", maxPrecipitation);
        } else {
            System.out.println("Вы ввели 0 дней:");
        }
    }
}