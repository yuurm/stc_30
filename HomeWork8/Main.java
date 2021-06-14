package HomeWork8;

public class Main {
    public static void main(String[] args) {
        Ellipse ellipse = new Ellipse(1, 1, 3, 2);
        System.out.println("Длина окружности эллипса: " + ellipse.getPerimeter());
        System.out.println("Площадь эллипса: " + ellipse.getArea());
        ellipse.move(3,5);
        ellipse.scale(2);

        Circle circle = new Circle(1, 1, 2);
        System.out.println("Длина окружности круга: " + circle.getPerimeter());
        System.out.println("Площадь круга: " + circle.getArea());
        circle.scale(3);
        System.out.println(circle instanceof Ellipse);
        System.out.println();




        Rectangle rectangle = new Rectangle(1, 1, 3, 2);
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        rectangle.move(4,7);
        rectangle.scale(6);

        Square square = new Square(1, 1, 3);
        System.out.println("Периметр квадрата: " + square.getPerimeter());
        System.out.println("Площадь квадрата: " + square.getArea());
        square.move(8,9);
        square.scale(4);
        System.out.println(square instanceof Rectangle);




        }
}
