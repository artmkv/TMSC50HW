package by.homework.hw12;

import java.util.List;

public class FactoryGetPartsThread extends Thread {

    private Factory factory;
    private List<Part> partsList;
    int number;

    public FactoryGetPartsThread(Factory factory, List<Part> partsList, int number) {
        this.factory = factory;
        this.partsList = partsList;
        this.number = number;
    }

    @Override
    public void run() {
        if(factory != null && partsList != null) {
            if (!this.partsList.isEmpty()) {
                this.partsList.clear();
            }
            partsList.addAll(factory.getParts(number));
        }
    }
}
