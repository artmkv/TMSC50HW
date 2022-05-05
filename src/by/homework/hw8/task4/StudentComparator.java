package by.homework.hw8.task4;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getFirstName().compareTo(o2.getFirstName());
        if(result == 0) {
            result = o1.getLastName().compareTo(o2.getLastName());
        }else if (result == 0) {
            result = o1.getAge().compareTo(o2.getAge());
        }
        return result == 0 ? (o1.getAverageRating()).compareTo( o2.getAverageRating()) : result;
    }
}