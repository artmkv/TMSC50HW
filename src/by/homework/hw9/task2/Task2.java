package by.homework.hw9.task2;


import by.homework.hw8.task4.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task2 {

    public static void main(String[] args) {
        List<Person> students = Arrays.asList(
                new Person("Ivan", "Gorodey", 17),
                new Person("Alexander", "Petrushinkin", 77),
                new Person("Nikolay", "Vorobey", 26),
                new Person("Svetlana", "Morozova", 45),
                new Person("Artur", "Zhuk", 34),
                new Person("Chunsu", "Sing", 21));
        Optional<Person> resultPerson = students.stream()
                .filter( person -> (person.getFirstName() + person.getLastName()).toString().length() < 16)
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .findFirst();
        System.out.println(resultPerson);
    }
}
