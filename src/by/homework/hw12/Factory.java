package by.homework.hw12;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


public class Factory {

    private Queue<Part> stock;
    private final Object LOCK = new Object();

    public Factory() {
        stock = new ArrayDeque<>() {
        };
    }

    public void addParts(List<Part> parts) {
        synchronized (LOCK) {
        if (parts != null && !parts.isEmpty()) {
                stock.addAll(parts);
                LOCK.notifyAll();
            }
        }
    }

    public List<Part> getParts(int number) {
        List<Part> list = new ArrayList<>();
        synchronized (LOCK) {
            for (int i = 0; i < number & !this.stock.isEmpty(); i++) {
                list.add(this.stock.poll());
                LOCK.notifyAll();
            }
        }
        return list;
    }

    public Queue<Part> getStock() {
        return stock;
    }

    public void setStock(Queue<Part> stock) {
        this.stock = stock;
    }
}
