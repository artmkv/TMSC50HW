package by.homework.hw5.figures.open;

import by.homework.hw5.figures.Figure;
import by.homework.hw5.figures.closed.Triangle;

public class Arc extends Section {

    double radius;
    Point centerArc;

    public Arc(Point point1, Point point2, double radius) {
        super(point1, point2);
        this.radius = radius;
        Point tempPoint = new Point(point1.getStartX() - point2.getStartX(), point1.getStartY() - point2.getStartY());
        Triangle tr = new Triangle(radius,
                point1.distance(tempPoint),
                Math.sqrt(Math.pow(radius, 2) - Math.pow(getPoint1().distance(getPoint2()) / 2, 2)));
        this.centerArc = tr.getPointC();
    }


    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getLength() {
        return 2 * radius * Math.sin(2 * Math.acos(Math.sqrt(
                Math.pow(radius, 2) - Math.pow(getPoint1().distance(getPoint2()) / 2, 2)) / radius));
    }

    @Override
    public String toString() {
        return "Arc{" +
                "radius=" + radius +
                ", centerArc=" + centerArc +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenterArc() {
        return centerArc;
    }

    public void setCenterArc(Point centerArc) {
        this.centerArc = centerArc;
    }
}
