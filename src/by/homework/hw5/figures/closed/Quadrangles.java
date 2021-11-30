package by.homework.hw5.figures.closed;

import by.homework.hw5.figures.Figure;
import by.homework.hw5.figures.open.Point;

public class Quadrangles extends Figure implements Lockable {

    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Quadrangles(Point pointA, Point pointB, Point pointC, Point pointD) {
        super(pointA.getStartX(), pointA.getStartY());
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }

    @Override
    public double getPerimeter() {
        return getPointA().distance(pointB) +
                pointB.distance(pointC) +
                pointC.distance(pointD) +
                pointD.distance(getPointA());
    }

    @Override
    public double getArea() {
        Triangle tr1 = new Triangle(getPointA(), getPointB(), getPointD());
        Triangle tr2 = new Triangle(getPointB(), getPointC(), getPointD());
        return tr1.getArea() + tr2.getArea();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Quadrangles that = (Quadrangles) o;

        if (pointB != null ? !pointB.equals(that.pointB) : that.pointB != null) return false;
        if (pointC != null ? !pointC.equals(that.pointC) : that.pointC != null) return false;
        return pointD != null ? pointD.equals(that.pointD) : that.pointD == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (pointB != null ? pointB.hashCode() : 0);
        result = 31 * result + (pointC != null ? pointC.hashCode() : 0);
        result = 31 * result + (pointD != null ? pointD.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Quadrangles{" + " PointA= " + getPointA() +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                ", pointD=" + pointD +
                ", Area=" + getArea() +
                '}';
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

    public Point getPointD() {
        return pointD;
    }

    public void setPointD(Point pointD) {
        this.pointD = pointD;
    }
}
