package by.homework.hw6;

import java.time.DateTimeException;

public class Main {

    public static void main(String[] args) {

        try {
            MyUtilitExeption.generateNullPointException();
        } catch (NullPointerException e1) {
            System.out.println(e1.getMessage());
            System.out.println(e1.getStackTrace());
            System.out.println("\n");
        }
        try {
            MyUtilitExeption.getJDKException();
        } catch (MyCheckedException e1) {
            System.out.println(e1.getMessage());
            System.out.println(e1.getCause());
            System.out.println(e1.getStackTrace());
            System.out.println("\n");
        }
        int[] ar = {5, 5, 3, 6, 87};
        try {
            System.out.println(MyUtilitExeption.getMaxElementOfArrayWithArrayIOOBException(ar));
        } catch (MyUncheckedException e1) {
            System.out.println(e1.getMessage());
            System.out.println(e1.getCause());
            System.out.println(e1.getStackTrace());
            System.out.println("\n");
        }
        System.out.println("\n");
        try {
            MyUtilitExeption.getMyIllegalArgumentException();
        } catch (MyUncheckedException e1) {
            System.out.println(e1.getMessage());
            System.out.println(e1.getCause());
            System.out.println(e1.getStackTrace());
            System.out.println("\n");
        }
        System.out.println("\n");
        try {
            MyUtilitExeption.getThreeException();
        } catch (ArithmeticException e) {
            System.out.println("This is ArithmeticException");
            System.out.println("Exception from method \"getThreeException\"");
        } catch (DateTimeException e) {
            System.out.println("This is DateTimeException");
            System.out.println("Exception from method \"getThreeException\"");
        } catch (ArrayStoreException e) {
            System.out.println("This is ArrayStoreException");
            System.out.println("Exception from method \"getThreeException\"");
        }
        System.out.println("\n");
        try {
            MyUtilitExeption.getFiftyFiftyException();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        } finally {
            System.out.println("Method \"getFiftyFiftyException\" is done.");
        }
    }
}
