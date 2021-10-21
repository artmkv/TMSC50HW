package by.homework.hw3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String string = (scanner.nextLine());
        System.out.println(isPalindrome(string));
    }

    public static boolean isPalindrome(String string) {
        if (!isEmpty(string)) {
            for (int i = 0; i < string.length() / 2; i++) {
                if (!(string.charAt(i) == string.charAt(string.length() - 1 - i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean isEmpty(String string) {
        return "".equals(string);
    }
}
