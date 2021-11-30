package by.homework.hw5.figures;

import by.homework.hw5.figures.closed.Rectangle;
import by.homework.hw5.figures.closed.Triangle;


public final class ShapeUtils {

    private ShapeUtils(){
        throw new UnsupportedOperationException();
    }

    public static boolean isRectangle(Object o) {
        if (o == null) return false;
        Rectangle fig = new Rectangle(0,0);
        return o.getClass() == fig.getClass();
    }

    public static boolean isTriangle(Object o) {
        if (o == null) return false;
        Figure fig = new Triangle(0,6,2);
        return o.getClass() == fig.getClass();
    }
}
