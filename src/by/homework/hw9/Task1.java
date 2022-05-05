package by.homework.hw9;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class Task1 {

    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(8, 9, 1, 2, 8, 4, 0, 5);
        Function<List<Integer>, String> listConverter = (list) -> {
            StringBuilder builder = new StringBuilder();
            for (Integer integer : list) {
                builder.append(integer);
            }
            return builder.toString();
        };
        System.out.println(listConverter.apply(listInteger));
    }
}
