package by.homework.hw8.task2;

import java.io.Serializable;
import java.util.HashMap;

public class Garage<T extends Car & Serializable> {

    public static final int ONE_CAR = 1;
    private HashMap<T, Integer> auto;

    public Garage() {
        this.auto = new HashMap<T, Integer>();
    }

    public Garage(HashMap<T, Integer> auto) {
        this.auto = auto;
    }

    public void parking(T car) {

        if(this.auto.containsKey(car)) {
            this.auto.replace(car, this.auto.get(car) + ONE_CAR);
        }else{
            this.auto.put(car, ONE_CAR);
        }
    }

    public boolean exit(T car) {
        if(this.auto.containsKey(car)) {
            if (this.auto.get(car) > 1) {
                this.auto.replace(car, this.auto.get(car) - ONE_CAR);
                return true;
            }
            if (this.auto.get(car) == 1) {
                this.auto.remove(car);
                return true;
            }
        }
            return false;
    }

    public int getNumberOfCar(T car) {
        if (this.auto.containsKey(car)) {
            return this.auto.get(car);
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Garage<?> garage = (Garage<?>) o;

        return auto != null ? auto.equals(garage.auto) : garage.auto == null;
    }

    @Override
    public int hashCode() {
        return auto != null ? auto.hashCode() : 0;
    }
}
