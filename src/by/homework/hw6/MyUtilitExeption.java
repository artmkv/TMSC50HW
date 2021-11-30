package by.homework.hw6;

import java.time.DateTimeException;

public abstract class MyUtilitExeption {

    public static void generateNullPointException() throws NullPointerException {
        throw new NullPointerException("Exception from method \"generateNullPointException\"");
    }

    public static int getMaxElementOfArrayWithArrayIOOBException(int[] array) throws MyUncheckedException {
        int max = 0;
        try {
            for (int i = 0; i <= 5; i++) {
                max = Math.max(array[i], array[i + 1]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new MyUncheckedException("Array is very small!", e);
        } finally {
            System.out.println("This method getMaxElement");
        }
        return max;
    }

    public static void getMyIllegalArgumentException() throws MyUncheckedException {
        try {
            throw new IllegalArgumentException("Exception from method \"getMyIllegalArgumentException\"");
        } catch (IllegalArgumentException e) {
            throw new MyUncheckedException(e.getMessage(), e);
        }
    }

    public static void getJDKException() throws MyCheckedException {
        try {
            throw new ClassNotFoundException("Class not founded in the world");
        } catch (ClassNotFoundException e) {
            throw new MyCheckedException("Exception from method \"getJDKException\"", e);
        }
    }

    public static void getThreeException() {
        long number = java.util.Calendar.getInstance().getTime().getTime();
        if (number % 10 == 5) {
            throw new ArithmeticException();
        }
        if (number % 10 < 5) {
            throw new DateTimeException("F");
        }
        if (number % 10 > 0) {
            throw new ArrayStoreException();
        }
    }

    public static void getFiftyFiftyException() {
        long number = java.util.Calendar.getInstance().getTime().getTime();
        if (number % 2 == 0) {
            throw new RuntimeException("Fifty-fifty Exception");
        }
    }
}
