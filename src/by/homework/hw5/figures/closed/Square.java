package by.homework.hw5.figures.closed;

public class Square extends Rectangle{

    public Square(double height){
        super(height, height);
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getDiagonal() {
        return super.getDiagonal();
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
        return "Rectangle{ Start (" + x + " ; " + y +")"+
                 " ; Height:"+ getHeight() + '}';
    }

}
