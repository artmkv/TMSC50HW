package by.homework.hw8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static final int LENGTH_WORD = 4;
    public static final String PASTE_STRING = "****";

    public static void main(String[] args) {

        int[] numberArray = {2, 8, 6, 8, 99, 3, 1, 5, 34, 21, 78};
        StringBuilder stringBuilder = new StringBuilder();
        for (int num : numberArray) {
            stringBuilder.append(num);
        }
        System.out.println(stringBuilder.toString());


        List<String> list = Arrays.asList("this", "is", "lots", "of", "fun", "for", "every",
                                        "Java", "programmer", "gray", "Reboot", "root");
        List<String> resultList = markLength4(list);
        System.out.println(list.toString());
        System.out.println(resultList.toString());
    }


    public static List<String> markLength4(List<String> list) {
        List<String> linkedList = new LinkedList<>();
        linkedList.addAll(list);
//        linkedList.addAll();
        System.out.println(linkedList.size());
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).toString().length() == LENGTH_WORD) {
                linkedList.add(i++, PASTE_STRING);
            }
        }
        return linkedList;
    }
}
