package by.homework.hw7;

import java.io.*;
import java.lang.Math;
import java.util.Arrays;

public class Task2 {

    private static final String FILE_SOURCE = "resources" + File.separator + "FileWithRandomNumber.txt";
    private static final String FILE_RESULT = "resources" + File.separator + "FileSortedNumber.txt";
    private static final int NUMBER = 12;
    private static final int MAX_OF_NUMBER = 1000;

    public static void main(String[] args) {

        File fileSource = new File(FILE_SOURCE);
        File fileResult = new File(FILE_RESULT);
        getRandomIntegerNumberToFile(fileSource, NUMBER);
        sortAscendingNumberInFile(fileSource, fileResult);
        printFileToConsole(fileSource);
    }

    public static void getRandomIntegerNumberToFile(File file, int maxNumber) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            for (int i = 0; i < maxNumber; i++) {
                int number = (int) (Math.random() * MAX_OF_NUMBER + 1);
//                System.out.println(number);
                if (i == maxNumber - 1) {
                    fileWriter.write(number + "");
                } else {
                    fileWriter.write(number + "\n");
                }
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }

    }

    public static void sortAscendingNumberInFile(File fileSource, File fileResult) {
        int[] c = new int[NUMBER];
        try (FileReader fileReader = new FileReader(fileSource)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str;
            int i = 0;
            while ((str = bufferedReader.readLine()) != null) {
                c[i] = Integer.valueOf(str);
                System.out.println(c[i]);
                i++;
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        Arrays.sort(c);
        try (FileWriter fileWriter = new FileWriter(fileResult)) {
            for(int num: c){
                fileWriter.write(num +"\n");
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }

    public static void printFileToConsole(File file) {
        try (FileReader fileReader = new FileReader(file)) {
            int letter;
            while ((letter = fileReader.read()) != -1) {
                System.out.print((char) letter);
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
    }
}
