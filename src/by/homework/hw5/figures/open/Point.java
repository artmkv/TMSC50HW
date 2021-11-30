package by.homework.hw5.figures.open;

import by.homework.hw5.figures.Figure;


public class Point extends Figure {

    public Point(double x, double y) {
        super(x, y);
    }

    @Override
    public double getArea() {
        return 0;
    }


    public double distance(Point point) {
        if (point != null) {
            return Math.sqrt(Math.pow(getStartX() - point.getStartX(), 2) + Math.pow(getStartY() - point.getStartY(), 2));
        }
        return 0.0;
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
        return " Point coordinates: (" + getStartX() + ";" + getStartY() + ")";
    }
}
