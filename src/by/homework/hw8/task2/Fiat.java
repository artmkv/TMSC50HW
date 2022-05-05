package by.homework.hw8.task2;

public class Fiat extends  Car {

    public static final String FIAT = "Fiat";

    public Fiat() {
        this.name = FIAT;
    }
    public Fiat(String model, int year, String color, int number) {
        this.name = FIAT;
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
