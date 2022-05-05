package by.homework.hw8;

import java.io.*;
import java.util.*;

public class Task1 {


    public static final String FILE_SOURCE = "resources" + File.separator + "EnglishText.txt";

    public static void main(String[] args) {
        File file = new File(FILE_SOURCE);
        List<String> list = getListOfWordFromFile(file);
        Map<String, Integer> mapWord = new HashMap<>(getFrequencyWords(list));
        System.out.println(mapWord.toString());
    }

    public static Map<String, Integer> getFrequencyWords(List<String> list) {
        Map<String, Integer> result = new HashMap<>();
        ArrayList<String> temp = new ArrayList<>(list);
        while (!(list.isEmpty())) {
            list.removeAll(Arrays.asList(list.get(0)));
            result.put(temp.get(0), Integer.valueOf(temp.size() - list.size()));
            temp.removeAll(Arrays.asList(temp.get(0)));
        }
        return result;
    }

    public static List<String> getListOfWordFromFile(File file) {
        List<String> list = new ArrayList<>();
        if (file != null) {
            try (FileReader fileReader = new FileReader(file)) {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String lines;
                while ((lines = bufferedReader.readLine()) != null) {
                    list.add(lines);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        List<String> listWords = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            listWords.addAll(Arrays.asList(list.get(i).split(" ")));
        }
        list.clear();
        for (int i = 0; i < listWords.size(); i++) {
            list.add(listWords.get(i).replaceAll("(^\\W|\\W+$|\\s+)", ""));
        }
        list.removeAll(Arrays.asList(""));
        return list;
    }
}
