package by.homework.hw8.task2;

public class Toyota extends Car {

    public static final String TOYOTA = "Toyota";

    public Toyota() {
        this.name = TOYOTA;
    }
    public Toyota(String model, int year, String color, int number) {
        this.name = TOYOTA;
        this.model = model;
        this.year = year;
        this.color = color;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
