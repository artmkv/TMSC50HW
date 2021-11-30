package by.homework.hw5.figures.closed;

import by.homework.hw5.figures.Figure;
import by.homework.hw5.figures.open.Point;

public class Rectangle extends Quadrangles {

    public Rectangle(double width, double height) {
        super(new Point(0, 0), new Point(width, 0), new Point(0, height), new Point(width, height));
    }

    public Rectangle(Point startPoint, double width, double height) {
        super(startPoint, new Point(width, 0), new Point(0, height), new Point(width, height));
    }

    @Override
    public double getPerimeter() {
        return (getWidth() + getWidth()) * 2;
    }

    @Override
    public double getArea() {
        return getWidth() * getWidth();
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
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
        return "Rectangle{ Start (" + x + " ; " + y +"); "+
                "Width: " + getWidth() + " ; Height:"+ getHeight() + '}';
    }

    public double getWidth() {
        return super.getPointD().getStartX();
    }

    public void setWidth(double width) {
        setStartX(width);
    }


    public double getHeight() {
        return super.getPointD().getStartY();
    }

    public void setHeight(double height) {
        setStartY(height);
    }

    @Override
    public double getStartX() {
        return super.getStartX();
    }

    @Override
    public void setStartX(double x) {
        super.setStartX(x);
    }

    @Override
    public double getStartY() {
        return super.getStartY();
    }

    @Override
    public void setStartY(double y) {
        super.setStartY(y);
    }


}
