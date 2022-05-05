package by.homework.hw8.task2;

public class Ferrari extends Car{

    public static final String FERRARI = "Ferrari";

    public Ferrari() {
        this.name = FERRARI;
    }

    public Ferrari(String model, int year, String color, int number) {
        this.name = FERRARI;
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
        return "Ferrari{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", number=" + number +
                '}';
    }



}
