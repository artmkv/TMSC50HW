package by.homework.hw2;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {1, 1, 3, 5, 7, 2, 3, 9, 1, 5, 3, 8, 7, 6, 1};
        System.out.println("Исходный массив");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        deleteSameNumber(array);
        System.out.println("Итоговый массив");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void deleteSameNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        array[j] = 0;
                    }
                }
            }
        }
    }
}
