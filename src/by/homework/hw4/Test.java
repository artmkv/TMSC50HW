package by.homework.hw4;

public class Test {

    public static void main(String[] args) {

        Point pointA = new Point(2, 0);
        Point pointB = new Point(-5, -6);
        Rectangle figure1 = new Rectangle(pointA, pointB);
        Rectangle figure2 = new Rectangle(new Point(3, 4), 5, 7);

        System.out.println("Площадь фигуры 1: \t" + figure1.getSquare());
        System.out.println("Периметр фигуры 1:\t" + figure1.getPerimeter());
        System.out.printf("Диагональ фигуры 1:\t%.2f\n", figure1.getDiagonal());
        System.out.println("Площадь фигуры 2:\t" + figure2.getSquare());
        System.out.println("Периметр фигуры 2:\t" + figure2.getPerimeter());
        System.out.printf("Диагональ фигуры 2:\t%.2f\n", figure2.getDiagonal());
        System.out.println("Площадь фигуры 3:\t" + new Rectangle(null, null).getSquare());
        System.out.println("Периметр фигуры 3:\t" + new Rectangle().getPerimeter());
        System.out.printf("Диагональ фигуры 3:\t%.2f\n", new Rectangle(pointA, null).getDiagonal());
    }
}
