package by.homework.hw11;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task2 {

    public static void main(String[] args) {

        String string = "Time 0xFE1 in London. At street 0x23, apartment OhA9. Train number 0x56D4E21A";
        Pattern pattern = Pattern.compile("(0x[0-9a-fA-F]{2,})");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
