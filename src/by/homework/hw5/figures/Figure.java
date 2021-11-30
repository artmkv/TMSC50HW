package by.homework.hw5.figures;

public abstract class Figure {

    protected double x = 0.0;
    protected double y = 0.0;

    public Figure(double startX, double startY) {
        this.x = startX;
        this.y = startY;
    }

    public abstract double getArea();

    public boolean isEqualsArea(Figure figure) {
        if (figure == null) return false;
        return getArea() == figure.getArea();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figure figure = (Figure) o;

        if (Double.compare(figure.x, x) != 0) return false;
        return Double.compare(figure.y, y) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double getStartX() {
        return x;
    }

    public void setStartX(double x) {
        this.x = x;
    }

    public double getStartY() {
        return y;
    }

    public void setStartY(double y) {
        this.y = y;
    }
}
