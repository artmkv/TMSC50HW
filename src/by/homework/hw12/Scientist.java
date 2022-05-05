package by.homework.hw12;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scientist {

    private Map<Part, Integer> robot;

    public Scientist() {
        this.robot = new HashMap<>();
    }

    public Scientist(Map<Part, Integer> parts) {
        this.robot = parts;
    }

    public void addPartToRobot(List<Part> list) {
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (!robot.containsKey(list.get(i))) {
                    robot.put(list.get(i), 1);
                } else {
                    robot.put(list.get(i), robot.get(list.get(i)) + 1);
                }
            }
        }
    }

    public int getNumberOfRobots() {
        System.out.println(robot.values().toString());
        return robot.values().stream().sorted().findFirst().get();
    }

    public Map<Part, Integer> getRobot() {
        return robot;
    }

    public void setRobot(Map<Part, Integer> robot) {
        this.robot = robot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Scientist scientist = (Scientist) o;

        return robot != null ? robot.equals(scientist.robot) : scientist.robot == null;
    }

    @Override
    public int hashCode() {
        return robot != null ? robot.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Scientist{" +
                "robot=" + robot +
                ", numberOfRobots=" + getNumberOfRobots() +
                '}';
    }
}
