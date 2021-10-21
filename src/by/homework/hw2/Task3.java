package by.homework.hw2;

public class Task3 {

    public static void main(String[] args) {
        int[] array1 = {3, 5, 6, 6, 5, 3, 8, 1, 5, 0, 7};
        int[] array2 = {22, 35, 23, 78, 99, 180, 67, 89};
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array3.length; ) {
            for (int j = 0; j < array1.length || j < array2.length; j++) {
                if (j < array1.length) {
                    array3[i] = array1[j];
                    i++;
                }
                if (j < array2.length) {
                    array3[i] = array2[j];
                    i++;
                }
            }
        }
        System.out.println("Исходные массивы");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Итоговый массив");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
