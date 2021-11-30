package by.homework.hw5;

import by.homework.hw5.figures.ShapeUtils;
import by.homework.hw5.figures.closed.Rectangle;
import by.homework.hw5.figures.closed.Triangle;
import by.homework.hw5.figures.open.Point;


public class MainTest {

    public static void main(String[] args) {

        Point a = new Point(5, 0);
        Point b = new Point(3, 5);
        Point c = new Point(5, 1);
        System.out.printf("Дистанция между точками a и b = %.2f\n", a.distance(b));

        Triangle g2 = new Triangle(a, b, c);
        Triangle tr3 = new Triangle(5.00, 4.00, 3.00);
        System.out.println("Равны ли треугольники" + tr3.equals(g2));

        System.out.println(tr3.toString());
        System.out.println(tr3.getPointA().toString());
        System.out.println(tr3.getPointB().toString());
        System.out.println(tr3.getPointC().toString());

        Rectangle sk1 = new Rectangle( 6, 9);
        Rectangle sk2 = new Rectangle(3, 8);
        System.out.println("Является ли объект прямоугольником:  " + ShapeUtils.isRectangle(sk1));
        System.out.println(sk1.toString());
        System.out.println(sk2.toString());



    }
}
