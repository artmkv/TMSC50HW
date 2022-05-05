package by.homework.hw7;

import java.io.*;
import java.lang.Character;

public class Task1 {

    private static final String FILE_INPUT = "resources" + File.separator + "PushkinAutumn.txt";
    private static final String FILE_OUTPUT = "resources" + File.separator + "Result.txt";

    public static void main(String[] args) {

        File fileSource = new File(FILE_INPUT);
        File fileResult = new File(FILE_OUTPUT);

        char[] russianAlphabet =
                {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й',
                        'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф',
                        'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        int [] frequencyOfLetter = getFrequencyOfLetterInText(fileSource, russianAlphabet);
        writeResultToFile(fileResult, frequencyOfLetter, russianAlphabet);
        readFileToConsole(fileResult);
    }

    public static int[] getFrequencyOfLetterInText(File file, char[] ArrayOfLetters) {
        int[] numberLetters = new int[ArrayOfLetters.length];
        try (FileReader streamReader = new FileReader(file)) {
            int letter;
            while ((letter = streamReader.read()) != -1) {
//                System.out.print((char) letter);
                for (int i = 0; i < ArrayOfLetters.length; i++) {
                    if (Character.toLowerCase((char) letter) == ArrayOfLetters[i]) {
                        numberLetters[i]++;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numberLetters;
    }

    public static void writeResultToFile(File fileForResult, int[] arrayResult, char[] arrayWithLetters) {
        try (FileWriter fileWriter = new FileWriter(fileForResult)) {
            for (int i = 0; i < arrayResult.length; i++) {
                fileWriter.write(arrayWithLetters[i] + " - " + arrayResult[i] + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFileToConsole(File file) {
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
