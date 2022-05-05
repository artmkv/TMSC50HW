package by.homework.hw12;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class TaskMain {

    public static final int NUMBER_PARTS_FIRST_NIGHT = 20;
    public static final int MAX_PART_PER_NIGHT = 4;
    public static final int NUMBER_NIGHT = 100;
    public static final int HOW_LONG_MILSEK_NIGHT = 100;

    public static void main(String[] args) throws InterruptedException {
        Factory factory = new Factory();
        Random random = new Random();
        PartsForRobot[] parts = PartsForRobot.values();
        if (factory.getStock().isEmpty()) {
            factory.addParts(generateRandomPartsList(NUMBER_PARTS_FIRST_NIGHT));
        }
        Scientist scientistFirst = new Scientist();
        Scientist scientistSecond = new Scientist();
        for (int i = 0; i < NUMBER_NIGHT; i++) {
            int r1 = random.nextInt(MAX_PART_PER_NIGHT);
            int r2 = random.nextInt(MAX_PART_PER_NIGHT);
            int r3 = random.nextInt(MAX_PART_PER_NIGHT);
            List<Part> list1 = new ArrayList();
            List<Part> list2 = new ArrayList();
            Thread add1 = new FactoryAddPartsThread(factory, generateRandomPartsList(r1));
            if (i != 0) {
                add1.start();
            }
            Thread get1 = new FactoryGetPartsThread(factory, list1, r2);
            Thread get2 = new FactoryGetPartsThread(factory, list2, r3);
            if(r2<r3){
                get1.start();
                get2.start();
            }
            else{
                get2.start();
                get1.start();
            }
            try {
                add1.join();
                get1.join();
                get2.join();
            }catch (InterruptedException e)
            {
                System.out.println(e.getStackTrace());
            }
            scientistFirst.addPartToRobot(list1);
            scientistSecond.addPartToRobot(list2);
            Thread.currentThread().sleep(HOW_LONG_MILSEK_NIGHT);
        }
        System.out.println("Robots of First Scientist: " + scientistFirst.getNumberOfRobots());
        System.out.println("Robots of Second Scientist: " + scientistSecond.getNumberOfRobots());
    }

    public static List<Part> generateRandomPartsList(int number){
        Random random = new Random();
        PartsForRobot[] parts = PartsForRobot.values();
        List<Part> list = new ArrayList<>();
        for(int i = 0; i< number; i++){
            list.add(new Part(parts[random.nextInt(PartsForRobot.values().length)]));
        }
        return list;
    }
}
