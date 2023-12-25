package com.codegym;

public class RectangleTest {
    public static void main(String[] args) {
        new Rectangle();
        Rectangle rectangle;
        Circle circle;
        circle = new Circle(3.5, "indigo", false);
        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println("trước khi tăng");
        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());
        System.out.println("Sau khi tăng");
        rectangle.resize(Math.random() * 100);
        circle.resize(Math.random() * 100);
        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());

    }
}
