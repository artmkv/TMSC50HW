package by.homework.hw2;

public class Task1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Исходный массив");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Сдвиг массива:");
        for (int i = 0; i < array.length; i++) {
            moveOnePointRight(array);
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void moveOnePointRight(int[] toArray) {
        int temp;
        for (int i = 1; i < toArray.length; i++) {
            temp = toArray[toArray.length - i];
            toArray[toArray.length - i] = toArray[toArray.length - i - 1];
            toArray[toArray.length - i - 1] = temp;
        }
    }
}
