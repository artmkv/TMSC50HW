package by.homework.hw8.task4;

import java.awt.print.Printable;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Student implements Iterable<Student>, Comparable<Student>{

    private String firstName;
    private String lastName;
    private Integer age;
    private Double averageRating;

    public Student(String firstName, String lastName, int age, double averageRating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageRating = averageRating;
    }
//    Operation po ;
    Printable prt;

    @Override
    public int compareTo(Student o) {
        return this.compareTo(o);
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (Double.compare(student.averageRating, averageRating) != 0) return false;
        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
        return lastName != null ? lastName.equals(student.lastName) : student.lastName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        temp = Double.doubleToLongBits(averageRating);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", averageRating=" + averageRating +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException();
        }
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }
}
