package by.homework.hw2;

public class Task4 {

    public static void main(String[] args) {
        int[][] array = {{1, 3, 7, 2}, {2, 4, 6, 5}, {5, 7, 3, 4,}, {0, 0, 3,}};
        System.out.println("Исходный массив");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        int[] newArray = linearize(array);
        System.out.println("Итоговый массив");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    public static int[] linearize(int[][] inputArray) {
        int lengthNewArray = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                lengthNewArray++;
            }
        }
        int[] array = new int[lengthNewArray];
        int a = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                array[a] = inputArray[i][j];
                a++;
            }
        }
        return array;
    }
}
