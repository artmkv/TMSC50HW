package by.homework.hw5.figures.open;

import by.homework.hw5.figures.Figure;

public class Section extends Figure implements Openable {

    private Point point2;

    public Section(Point point1, Point point2) {
        super(point1.getStartX(), point1.getStartY());
        this.point2 = point2;
    }

    public Section(Point point1, double length) {
        super(point1.getStartX(), point1.getStartY());
        point2 = new Point(point1.getStartX() + length, point1.getStartY());
    }
    public Section(double length) {
        super(0, 0);
        point2 = new Point(length,0);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getLength() {
        return point2.distance(new Point(getStartX(), getStartY()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Section section = (Section) o;

        return point2 != null ? point2.equals(section.point2) : section.point2 == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (point2 != null ? point2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Section{" +
                "point1" + getPoint1().toString() +
                ", point2=" + point2.toString() +
                ", length=" + getLength() +
                '}';
    }

    public Point getPoint1() {
        Point point = new Point(getStartX(), getStartY());
        return point;
    }

    public void setPoint1(Point point) {
        setStartX(point.getStartX());
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point) {
        point2 = point;
    }
}