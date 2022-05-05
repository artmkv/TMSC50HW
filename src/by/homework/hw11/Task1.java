package by.homework.hw11;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input e-mail: ");
        String string = in.next();
        Pattern pattern = Pattern.compile("^[a-zA-Z]{1}\\w*@[a-zA-Z_]+?\\.(org|com)$");
        Matcher matcher = pattern.matcher(string);
        System.out.println(matcher.matches());
    }
}
