package com.solid.l.good;

public class GoodGraphicsService {

    public void checkForArea(Shape shape) {
        if (shape instanceof GoodSquare) {
            verify(shape, "Square");
        } else if (shape instanceof GoodRectangle) {
            verify(shape, "Rectangle");
        }
    }

    private void verify(Shape shape, String entity) {
        int expectedArea = shape.getArea();
        if (expectedArea > 0) {
            System.out.println("Great " + entity + " you got there!");
        } else {
            System.out.println("Well, not a " + entity + ".");
        }
    }
}
