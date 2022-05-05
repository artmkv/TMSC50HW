package by.homework.hw12;

import java.util.List;

public class FactoryAddPartsThread extends Thread {

    private Factory factory;
    private List<Part> partsList;

    public FactoryAddPartsThread(Factory factory, List<Part> partsList) {
        this.factory = factory;
        this.partsList = partsList;
    }

    @Override
    public void run() {
        if (this.partsList != null && !this.partsList.isEmpty()) {
            factory.addParts(partsList);
        }
    }
}
