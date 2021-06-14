package HomeWork8;

public class Rectangle extends GeometricFigure implements Moveble, Scalable{
    public double height;
    public double width;

    public Rectangle(double x, double y, double height, double width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }


    public double getArea() {
        return height * width;
    }


    public double getPerimeter() {
        return (height + width) * 2;
    }


    public void move(double dX, double dY) {
        this.x += dX;
        this.y += dY;
    }


    public void scale (double multiplier) {
        this.height *= multiplier;
        this.width *= multiplier;
    }


}
