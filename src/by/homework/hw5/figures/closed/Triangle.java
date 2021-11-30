package by.homework.hw5.figures.closed;

import by.homework.hw5.figures.Figure;
import by.homework.hw5.figures.open.Point;

public class Triangle extends Figure implements Lockable {

    private Point pointB;
    private Point pointC;

    public Triangle(double side1, double side2, double side3) {
        super(0, 0);
        double max = Math.max(side1, Math.max(side2, side3));
        double min = Math.min(side1, Math.max(side2, side3));
        double p = (side1 + side2 + side3) / 2;
        double y = 2 * (Math.sqrt(p * (p - side1) * (p - side2) * (p - side3))) / max;
        double x = Math.sqrt(Math.pow(min, 2) - Math.pow(y, 2));
        pointB = new Point(max, 0);
        pointC = new Point(x, y);
    }

    public Triangle(Point pointA, Point pointB, Point pointC) {
        super(pointA.getStartX(), pointA.getStartY());
        this.pointB = pointB;
        this.pointC = pointC;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - getPointA().distance(pointB)) *
                (p - pointB.distance(pointC)) *
                (p - pointC.distance(getPointA())));
    }

    @Override
    public double getPerimeter() {
        return getPointA().distance(pointB) + pointB.distance(pointC) + pointC.distance(getPointA());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Triangle triangle = (Triangle) o;

        if (pointB != null ? !pointB.equals(triangle.pointB) : triangle.pointB != null) return false;
        return pointC != null ? pointC.equals(triangle.pointC) : triangle.pointC == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (pointB != null ? pointB.hashCode() : 0);
        result = 31 * result + (pointC != null ? pointC.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1 = " +  getPointA().distance(pointB)+
                ", side2 = " + pointB.distance(pointC) +
                ", side3 = " + pointC.distance(getPointA()) +
                '}';
        //return "Triangle" + getStartX() + ";" + getStartY() + ")";
    }

    public double getHeightFromPointA() {
        return 2 * getPerimeter() / pointB.distance(pointC);
    }

    public double getHeightFromPointB() {
        return 2 * getPerimeter() / pointC.distance(getPointA());
    }

    public double getHeightFromPointC() {
        return 2 * getPerimeter() / pointB.distance(getPointA());
    }


    public Point getPointA() {
        return new Point(getStartX(), getStartY());
    }

    public void setPointA(Point point) {
        setStartX(point.getStartX());
        setStartY(point.getStartY());
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
}
