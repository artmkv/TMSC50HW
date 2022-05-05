package by.homework.hw8.task2;

public class Task2 {

    public static void main(String[] args) {

        Car honda = new Honda();
        Car fiat = new Fiat();
        Car honda2 = new Honda("Fit",2010, "blue",7845);
        Car honda3 = new Honda("jazz",2000, "red",4432);
        Car fiat2 = new Fiat();
        Garage garage = new Garage();
        garage.parking(honda);
        garage.parking(fiat);
        garage.parking(honda2);
        System.out.println(garage.getNumberOfCar(honda));
        garage.parking(honda3);
        System.out.println(garage.getNumberOfCar(honda));
        garage.parking(honda2);
        garage.parking(honda2);
        garage.parking(honda2);
        System.out.println(garage.getNumberOfCar(honda2));
        System.out.println(garage.exit(honda2));
        System.out.println(garage.exit(honda3));
        System.out.println(garage.exit(honda2));
        System.out.println(garage.getNumberOfCar(honda2));
        System.out.println(garage.getNumberOfCar(fiat));
        System.out.println(garage.exit(fiat));
        System.out.println(garage.getNumberOfCar(fiat));
        System.out.println(garage.exit(fiat));
        System.out.println(garage.getNumberOfCar(fiat));
    }
}
