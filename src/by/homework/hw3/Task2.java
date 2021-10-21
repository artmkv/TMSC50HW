package by.homework.hw3;

import java.util.Scanner;

public class Task2 {

    public static final int M_NUMBER = 1000;
    public static final int D_NUMBER = 500;
    public static final int C_NUMBER = 100;
    public static final int L_NUMBER = 50;
    public static final int X_NUMBER = 10;
    public static final int V_NUMBER = 5;
    public static final int I_NUMBER = 1;

    public static void main(String[] args) {
        System.out.println("Введите число в римском формате:");
        Scanner scanner = new Scanner(System.in);
        String string = new String(scanner.nextLine());
        System.out.println("Число в арабском формате:");
        System.out.println(getArabicNumber(string));
    }

    public static int getArabicNumber(String string) {
        if (!isEmpty(string)) {
            int number = 0;
            int i = 0;
            while (i < string.length()) {
                switch (string.charAt(i)) {
                    case ('M'):
                        while (i < string.length() && string.charAt(i) == 'M') {
                            number += M_NUMBER;
                            i++;
                        }
                        break;
                    case ('D'):
                        number += D_NUMBER;
                        i++;
                        while (i < string.length() && string.charAt(i) == 'C') {
                            number += C_NUMBER;
                            i++;
                        }
                        break;
                    case ('C'):
                        if (i + 1 >= string.length()) {
                            number += C_NUMBER;
                            break;
                        }
                        if (string.charAt(i + 1) == 'M') {
                            number += M_NUMBER - C_NUMBER;
                            i += 2;
                            break;
                        }
                        if (string.charAt(i + 1) == 'D') {
                            number += D_NUMBER - C_NUMBER;
                            i += 2;
                            break;
                        }
                        while (i < string.length() && string.charAt(i) == 'C') {
                            number += C_NUMBER;
                            i++;
                        }
                        break;
                    case ('L'):
                        number += L_NUMBER;
                        i++;
                        while (i < string.length() && string.charAt(i) == 'X') {
                            number += X_NUMBER;
                            i++;
                        }
                        break;
                    case ('X'):
                        if (i + 1 >= string.length()) {
                            number += X_NUMBER;
                            break;
                        }
                        if (string.charAt(i + 1) == 'C') {
                            number += C_NUMBER - X_NUMBER;
                            i += 2;
                            break;
                        }
                        if (string.charAt(i + 1) == 'L') {
                            number += L_NUMBER - X_NUMBER;
                            i += 2;
                            break;
                        }
                        while (i < string.length() && string.charAt(i) == 'X') {
                            number += X_NUMBER;
                            i++;
                        }
                        break;
                    case ('V'):
                        number += V_NUMBER;
                        i++;
                        while (i < string.length() && string.charAt(i) == 'I') {
                            number += I_NUMBER;
                            i++;
                        }
                        break;
                    case ('I'):
                        if (i + 1 >= string.length()) {
                            number += I_NUMBER;
                            break;
                        }
                        if (string.charAt(i + 1) == 'X') {
                            number += X_NUMBER - I_NUMBER;
                            i += 2;
                            break;
                        }
                        if (string.charAt(i + 1) == 'V') {
                            number += V_NUMBER - I_NUMBER;
                            i += 2;
                            break;
                        }
                        while (i < string.length() && string.charAt(i) == 'I') {
                            number += I_NUMBER;
                            i++;
                        }
                        break;
                    default:
                        i = string.length();
                        number = 0;
                        System.out.println("Некорректный символ");
                        break;
                }
            }
            return number;
        }
        return 0;
    }

    public static boolean isEmpty(String string) {
        return "".equals(string);
    }
}
