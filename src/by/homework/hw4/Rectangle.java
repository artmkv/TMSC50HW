package by.homework.hw4;

public class Rectangle {

    private Point point1;
    private Point point2;

    public Rectangle() {
    }

    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Rectangle(Point firstPoint, double width, double height) {
        point1 = firstPoint;
        point2 = new Point(firstPoint.getX() + width, firstPoint.getY() + height);
    }

    public double getSquare() {
        if (point1 != null || point2 != null) {
            return Math.abs((point1.getX() - point2.getX()) * (point1.getY() - point2.getY()));
        }
        return 0.0;
    }

    public double getPerimeter() {
        if (point1 != null || point2 != null) {
            return Math.abs(2 * (point1.getX() - point2.getX() + point1.getY() - point2.getY()));
        }
        return 0.0;
    }

    public double getDiagonal() {
        if (point1 != null || point2 != null) {
            return point1.distance(point2);
        }
        return 0.0;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }
}
