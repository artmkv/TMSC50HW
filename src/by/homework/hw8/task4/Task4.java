package by.homework.hw8.task4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Ivan", "Gorodey", 17, 7),
                new Student("Alex", "Petrushin", 19, 6.8),
                new Student("Nikolay", "Vorobey", 18, 5.2),
                new Student("Sveta", "Morozova", 22, 9.1),
                new Student("Artur", "Zhuk", 18, 7.2),
                new Student("Chu", "Sing", 20, 6.0));
        Iterator<Student> iterator = students.iterator();
        double smartestStudent = getSmartestStudent(iterator);
        System.out.println(smartestStudent);
        for(Student st : students){
            System.out.println(st.toString());
        }
        Collections.sort(students,new StudentComparator());
        for(Student st : students){
            System.out.println(st.toString());
        }
    }

    private static double getSmartestStudent(Iterator<Student> iterator) {
        double result = 0;
        double temp = 0;
        while (iterator.hasNext()) {
            temp = iterator.next().getAverageRating().doubleValue();
            if (result < temp)
                result = temp;
        }
        return result;
    }
}